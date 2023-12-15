package org.willxu.algorithm.service.integer;

public interface SubarrayProductLessThanK {
    /**
     * Given an array of integers nums and an integer k, return the
     * number of contiguous subarrays where the product of all the
     * elements in the subarray is strictly less than k.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             1 <= nums[i] <= 1000
     * @param k 0 <= k <= 10^6
     */
    int numSubarrayProductLessThanK(int[] nums, int k);
}
