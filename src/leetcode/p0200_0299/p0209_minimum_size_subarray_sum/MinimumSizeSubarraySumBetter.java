/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumSizeSubarraySum;

public class MinimumSizeSubarraySumBetter implements MinimumSizeSubarraySum {

    /**
     * A Better brute force
     *
     * Algorithm: The only difference from bruteForce is in the war of
     * finding the sum of subarray:
     *   Create a vector sums of size of nums
     *   Initialize sums[0]=nums[0]
     *   Iterate over the sums vector:
     *     Update sums[i] = sums[i-1] + nums[i]
     *   Sum of subarray form i to j is calculated as:
     *     sum = sums[j] - sums[i] + nums[i]
     *   where in
     *     sums[j] - sums[i]
     *   is the sum from (i + 1)th element to the jth element.
     *
     * 空间换时间，把求和数据存入 array， 然后取值计算
     * Time complexity: O(n^2).
     * Space complexity: O(n).
     *
     * @param target 1 <= target <= 10^9
     * @param nums 1 <= nums.length <= 10^5
     *             1 <= nums[i] <= 10^5
     * @return minimum size subarray sum
     */
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        // 计算到第 k 个数为止的子数组和
        int[] sums = new int[n];
        // ArrayIndexOutOfBoundsException
        if (n == 0) {
            return 0;
        }
        sums[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i-1] + nums[i];
        }
        // i,j 的逻辑等同于 bruteForce int里截取的长度 i 从0到nums.length
        for (int i = 1; i <= n; i++) {
            // 第二层循环： j 从0到 nums.length - i，求和第j到第j+i-1个数
            for (int j = 0; j <= n - i; j++) {
                int sum = sums[j + i -1] - ((j - 1 < 0)?0:sums[j - 1]);
                if (sum >= target){
                    return i;
                }
            }
        }
        return 0;
    }
}
