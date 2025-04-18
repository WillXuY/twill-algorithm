/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0594_longest_harmonious_subsequence;

import java.util.TreeMap;

public class LongestHarmoniousSubsequenceCount
        implements LongestHarmoniousSubsequence {
    @Override
    public int findLHS(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i: nums) {
            if (treeMap.containsKey(i)) {
                treeMap.put(i, treeMap.get(i) + 1);
            } else {
                treeMap.put(i, 1);
            }
        }
        Integer last = null;
        int max = 0;
        for (int key: treeMap.keySet()) {
            if (last == null) {
                last = key;
                continue;
            }
            if (key - last == 1) {
                int count = treeMap.get(last) + treeMap.get(key);
                if (count > max) {
                    max = count;
                }
            }
            last = key;
        }
        return max;
    }
}
