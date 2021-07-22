#!/bin/bash

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
