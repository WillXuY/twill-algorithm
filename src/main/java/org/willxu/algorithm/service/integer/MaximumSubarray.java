/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface MaximumSubarray {
    /**
     * Given an integer array nums, find the contiguous subarray
     * (containing at least one number) which has the largest sum and
     * return its sum.
     *
     * Follow up: If you have figured out the O(n) solution, try coding
     * another solution using the divide and conquer approach, which is
     * more subtle.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             -10^5 <= nums[i] <= 10^5
     * @return the contiguous subarray has the largest sum
     */
    int maxSubArray(int[] nums);
}
