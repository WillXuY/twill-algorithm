package org.willxu.algorithm.service.integer;

public interface SubarraySumsDivisibleByK {
    /**
     * Given an integer array nums and an integer k, return the number
     * of non-empty subarrays that have a sum divisible by k.
     * <p>
     * A subarray is a contiguous part of an array.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             -10^4 <= nums[i] <= 10^4
     * @param k 2 <= k <= 10^4
     */
    int subarraysDivByK(int[] nums, int k);
}
