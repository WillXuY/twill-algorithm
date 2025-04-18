/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0697_degree_of_an_array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class DegreeOfAnArrayIndex implements DegreeOfAnArray {
    @Override
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        TreeSet<Integer> longestElementSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            lastIndexMap.put(nums[i], i);
            if (!firstIndexMap.containsKey(nums[i])) {
                firstIndexMap.put(nums[i], i);
            }
            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
            if (longestElementSet.contains(nums[i])
                    || longestElementSet.isEmpty()) {
                longestElementSet.clear();
                longestElementSet.add(nums[i]);
            } else {
                int maxCount = countMap.get(longestElementSet.first());
                int count = countMap.get(nums[i]);
                if (count == maxCount) {
                    longestElementSet.add(nums[i]);
                }
            }
        }
        int minLength = Integer.MAX_VALUE;
        for (int i: longestElementSet) {
            int length = lastIndexMap.get(i) - firstIndexMap.get(i) + 1;
            minLength = Math.min(length, minLength);
        }
        return minLength;
    }
}
