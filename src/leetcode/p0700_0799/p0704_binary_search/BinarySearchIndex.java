/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0704_binary_search;

public class BinarySearchIndex implements BinarySearch {
    @Override
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int diff = max - min;
        while (diff / 2 > 0) {
            int index = min + diff / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] < target) {
                min = index;
            } else {
                max = index;
            }
            diff = max - min;
        }
        if (nums[min] == target) {
            return min;
        }
        if (nums[max] == target) {
            return max;
        }
        return -1;
    }
}
