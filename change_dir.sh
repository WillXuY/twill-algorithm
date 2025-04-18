#!/bin/bash

set -euo pipefail

INPUT_FILE="test_change_dir.txt"
TARGET_BASE="src/leetcode"

# 将题目名转换为驼峰命名
to_camel_case() {
  echo "$1" | sed -E 's/[^a-zA-Z0-9]+/ /g' \
    | awk '{for (i=1; i<=NF; i++) $i=toupper(substr($i,1,1)) tolower(substr($i,2))} 1' \
    | tr -d ' '
}

# 提取文件名前缀函数
extract_class_prefix_from_path() {
  local path="$1"
  # 只要路径部分，如 src/test/java/org/willxu/TwoSumTest.java
  local filename=$(basename "$path")
  local name="${filename%.*}"  # 去掉后缀
  name="${name%Test}"          # 去掉末尾的 Test（如果有）
  echo "$name"
}

while IFS= read -r line; do
  [[ "$line" =~ ^\|[[:space:]]*[0-9]+[[:space:]]*\| ]] || continue

  number=$(echo "$line" | awk -F'|' '{gsub(/ /,"",$2); print $2}')
  raw_title=$(echo "$line" | awk -F'|' '{print $3}' | sed -E 's/\[([^]]+)\].*/\1/')
  last_path=$(echo "$line" | awk -F'|' '{print $4}' | grep -oE '\(.*\)' | tr -d '()')
  class_prefix=$(extract_class_prefix_from_path "$last_path")

  padded_num=$(printf "%04d" "$number")
  folder_name="${padded_num}-${class_prefix}"
  target_dir="${TARGET_BASE}/${folder_name}"

  echo "+ Processing: $folder_name"
  echo "  ➤ From: $last_path"
  echo "  ➤ Class prefix: $class_prefix"
  echo "  ➤ Target directory: $target_dir"

  mkdir -p "$target_dir"

  # 删除已有的同名前缀文件
  echo "  ⏳ Removing old files with prefix ${class_prefix}* in $TARGET_BASE ..."
  find "$TARGET_BASE" -type f -iname "${class_prefix}*" -exec rm -v {} \;

  # 搜索 src/main 和 src/test 中的相关文件
  echo "  🔍 Searching for files matching ${class_prefix}* in src/main and src/test ..."
  files=$(find src/main src/test -type f -iname "${class_prefix}*")

  if [[ -z "$files" ]]; then
    echo "  ⚠ No files found for ${class_prefix}"
    continue
  fi

  for file in $files; do
    echo "  ✅ Copying $file → $target_dir"
    mv "$file" "$target_dir/"
  done

done < "$INPUT_FILE"
