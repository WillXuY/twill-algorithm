package org.willxu.algorithm.service.bool;

public interface ContinuousSubarraySum {
    /**
     * Given an integer array nums and an integer k, return true if nums
     * has a good subarray or false otherwise.
     * <p>
     * A good subarray is a subarray where:
     * <p>
     * - its length is at least two, and
     * - the sum of the elements of the subarray is a multiple of k.
     * <p>
     * Note that:
     * <p>
     * - A subarray is a contiguous part of the array.
     * - An integer x is a multiple of k if there exists an integer n
     *   such that x = n * k. 0 is always a multiple of k.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             0 <= nums[i] <= 10^9
     *             0 <= sum(nums[i]) <= 2^31 - 1
     * @param k 1 <= k <= 2^31 - 1
     */
    boolean checkSubarraySum(int[] nums, int k);
}
