#!/bin/bash

# 遍历 src 目录下所有的 Java 文件
find src/ -type f -name "*.java" | while read java_file; do
    # 获取相对路径，不包括 src/
    relative_path="${java_file#src/}"

    # 去掉文件名（得到包路径）
    dir_path=$(dirname "$relative_path")

    # 将路径中的 / 替换为 .
    package_path=$(echo "$dir_path" | sed 's/\//./g')

    # 生成目标的 package 声明
    package_declaration="package $package_path;"

    # 替换文件中的 package 行（不是第一行的情况）
    sed -i "0,/^package /s/^package .*/$package_declaration/" "$java_file"

    echo "Updated package in: $java_file"
done
