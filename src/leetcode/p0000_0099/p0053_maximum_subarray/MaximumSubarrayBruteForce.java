/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0053_maximum_subarray;

public class MaximumSubarrayBruteForce implements MaximumSubarray {
    @Override
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int thisSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // save the sum rather than the nums[i]
            if (thisSum >= 0) {
                thisSum += nums[i];
            } else {
                thisSum = nums[i];
            }
            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
        }
        return maxSum;
    }
}
