#!/bin/bash

# 遍历当前目录下匹配 "####-Name" 格式的文件夹
for dir in ????-*; do
    if [ -d "$dir" ]; then
        # 拆分题号和名称
        number="${dir%%-*}"             # 取出数字编号部分
        name="${dir#*-}"                # 取出名称部分

        # 将驼峰命名转为下划线命名：StackQueue => stack_queue
        # 步骤：先在大写字母前加下划线，再转为小写
        snake_name=$(echo "$name" | sed -E 's/([A-Z])/_\1/g' | tr 'A-Z' 'a-z' | sed 's/^_//')

        # 拼接新文件夹名
        new_dir="p${number}_${snake_name}"

        echo "📁 Renaming: $dir → $new_dir"
        mv "$dir" "$new_dir"
    fi
done

echo "✅ 重命名完成！"
