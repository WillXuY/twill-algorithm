/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0674_longest_continuous_increasing_subsequence;

public interface LongestContinuousIncreasingSubsequence {
    /**
     * Given an unsorted array of integers nums, return the length of
     * the longest continuous increasing subsequence (i.e. subarray).
     * The subsequence must be strictly increasing.
     * A continuous increasing subsequence is defined by two indices 1
     * and r (1 < r) such that it is [nums[l], nums[l + 1], ...,
     * nums[r - 1]] and for each 1 <= i < r, nums[i] < nums[i + 1].
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^9 <= nums[i] <= 10^9
     * @return find the length of the longest continuous increasing
     *         subsequence.
     */
    int findLengthOfLCIS(int[] nums);
}
