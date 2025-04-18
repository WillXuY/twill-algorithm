#!/bin/bash

# Copyright (C) 2021  Weiyang(Will) Xu
#
# This file is part of template.
# Template is free software: you can redistribute it and/or modify
# it under the term of the GNU General Public License version 3 or
# any later version, as specified in the readme.md file.

193. Valid Phone Numbers
grep '^\(([0-9]\{3\}) \|[0-9]\{3\}-\)[0-9]\{3\}-[0-9]\{4\}$' file.txt

195. Tenth Line
i=1
while read line; do

    if [ $i == 10 ];
    then
        echo "$line"
    fi
    i=$((i+1))
done < file.txt
