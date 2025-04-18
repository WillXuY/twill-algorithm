/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0209_minimum_size_subarray_sum;

public interface MinimumSizeSubarraySum {

    /**
     * Given an array of n positive integers and a positive integer s,
     * find the minimal length of a contiguous subarray of which the
     * sum >= s. If there isn't one, return 0 instead.
     *
     * Follow up:
     * If you have figured out the O(n) solution, try coding another
     * solution of which the time complexity is O(n log(n)).
     *
     * @param target 1 <= target <= 10^9
     * @param nums 1 <= nums.length <= 10^5
     *             1 <= nums[i] <= 10^5
     * @return minimum size subarray sum
     */
    int minSubArrayLen(int target, int[] nums);
}
