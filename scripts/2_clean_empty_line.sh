#!/bin/bash

# 遍历 src/ 目录下所有 .java 文件
find src/ -type f -name "*.java" | while read -r file; do
  echo "Cleaning $file"
  # 使用 sed 删除连续多行空行，只保留一个
  # -i 直接修改文件（请备份重要文件）
  sed -i '/^[[:space:]]*$/{
    N
    /^[[:space:]]*\n[[:space:]]*$/D
  }' "$file"

  # 多次执行以彻底清理多个连续空行（可选）
  sed -i '/^$/N;/^\n$/D' "$file"
done

echo "Done cleaning extra blank lines."
