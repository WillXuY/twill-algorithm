package org.willxu.algorithm.service.integer;

public interface CountEqualAndDivisiblePairsInAnArray {
    /**
     * Given a 0-indexed integer array nums of length n and an integer
     * k, return the number of pairs (i, j) where 0 <= i < j < n, such
     * that nums[i] == nums[j] and (i * j) is divisible by k.
     *
     * @param nums,k 1 <= nums.length <= 100
     *               1 <= nums[i], k <= 100
     */
    int countPairs(int[] nums, int k);
}
