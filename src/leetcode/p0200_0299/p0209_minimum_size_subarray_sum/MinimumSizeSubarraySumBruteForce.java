/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0209_minimum_size_subarray_sum;

public class MinimumSizeSubarraySumBruteForce
        implements MinimumSizeSubarraySum {

    /**
     * 暴力求解复杂度过高
     * Brute force [Time Limit Exceeded]
     * Time complexity: O(n^3).
     * Space complexity: O(1).
     *
     * @param target 1 <= target <= 10^9
     * @param nums 1 <= nums.length <= 10^5
     *             1 <= nums[i] <= 10^5
     * @return minimum size subarray sum
     */
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        // 第一层循环： int里截取的长度 i 从0到nums.length
        for (int i = 1; i <= nums.length; i++) {
            // 第二层循环： j 从0到 nums.length - i，求和第j到第j+i-1个数
            for (int j = 0; j <= nums.length - i; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += nums[j + k];
                }
                if (sum >= target) {
                    return i;
                }
            }
        }
        return 0;
    }
}
