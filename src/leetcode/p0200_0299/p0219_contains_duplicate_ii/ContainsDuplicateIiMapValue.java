/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0219_contains_duplicate_ii;

import leetcode.p0200_0299.p0219_contains_duplicate_ii.ContainsDuplicateIi;

import java.util.TreeMap;

public class ContainsDuplicateIiMapValue implements ContainsDuplicateIi {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])) {
                return true;
            }
            map.put(i, nums[i]);
            map.remove(i - k);
        }
        return false;
    }
}
