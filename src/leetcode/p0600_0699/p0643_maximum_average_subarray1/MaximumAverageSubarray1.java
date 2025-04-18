/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0643_maximum_average_subarray1;

public interface MaximumAverageSubarray1 {
    /**
     * You are given an integer array nums consisting of n elements,
     * and an integer k.
     * Find a contiguous subarray whose length is equal to k that has
     * the maximum average value and return this value. Any answer with
     * a calculation error less than 10^-5 will be accepted.
     *
     * @param nums 1 <= k <= nums.length <= 10^5
     * @param k 1 <= k <= nums.length <= 10^5
     * @return max sub array's max average.
     */
    double findMaxAverage(int[] nums, int k);
}
