/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0035_search_insert_position;

public class SearchInsertPositionBruteForce implements SearchInsertPosition {
    @Override
    public int searchInsert(int[] nums, int target) {
        int half = nums.length / 2;
        int max = nums.length - 1;
        int min = 0;
        if (target > nums[max]) {
            return max + 1;
        }
        while (max != min) {
            if (target == nums[half]) {
                return half;
            }
            if (target < nums[half]) {
                max = half;
            } else {
                min = half;
            }
            half = min + (max - min) / 2;
            if (max - min == 1) {
                if (target > nums[min]) {
                    return max;
                } else {
                    return min;
                }
            }
        }
        return min;
    }
}
