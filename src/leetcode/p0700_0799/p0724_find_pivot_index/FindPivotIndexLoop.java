/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0724_find_pivot_index;

public class FindPivotIndexLoop implements FindPivotIndex {
    @Override
    public int pivotIndex(int[] nums) {
        int rightCount = 0;
        for (int i = 1; i < nums.length; i++) {
            rightCount += nums[i];
        }
        int leftCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftCount == rightCount) {
                return i;
            }
            leftCount += nums[i];
            if (i == nums.length - 1) {
                rightCount = 0;
            } else {
                rightCount -= nums[i + 1];
            }
        }
        return -1;
    }
}
