#!/bin/bash

set -e

echo "🔍 Scanning for duplicate files to delete from src/main and src/test ..."

# 1. 遍历 src/leetcode 下的所有文件
find src/leetcode -type f | while read -r file_path; do
    # 获取纯文件名，不带路径
    filename=$(basename "$file_path")
    echo "➡ Checking for duplicates of: $filename"

    # 2. 查找 src/main 和 src/test 下的同名文件
    find src/main src/test -type f -name "$filename" | while read -r duplicate; do
        echo "❌ Deleting: $duplicate"
        rm "$duplicate"
    done
done

echo "✅ Done cleaning duplicates."
