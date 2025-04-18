#!/bin/bash

set -e

ROOT="src/leetcode"

# 遍历所有以 p 开头的目录
for dir in "$ROOT"/p[0-9][0-9][0-9][0-9]_*/; do
    [ -d "$dir" ] || continue
    base=$(basename "$dir")

    # 提取题号
    number=$(echo "$base" | cut -c2-5)

    if [[ ! "$number" =~ ^[0-9]{4}$ ]]; then
        echo "Skipping invalid folder: $base"
        continue
    fi

    # 计算分组目录
    lower=$(( (10#$number / 100) * 100 ))
    upper=$(( lower + 99 ))
    group_name=$(printf "p%04d_%04d" "$lower" "$upper")
    target_dir="$ROOT/$group_name"

    # 创建目标目录并移动
    mkdir -p "$target_dir"
    echo "Moving $base → $group_name/"
    mv "$dir" "$target_dir/"
done
