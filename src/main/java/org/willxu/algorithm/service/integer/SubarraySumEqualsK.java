package org.willxu.algorithm.service.integer;

public interface SubarraySumEqualsK {
    /**
     * Given an array of integers nums and an integer k, return the
     * total number of subarrays whose sum equals to k.
     * <p>
     * A subarray is a contiguous non-empty sequence of elements within
     * an array.
     *
     * @param nums 1 <= nums.length <= 2 * 10^4
     *             -1000 <= nums[i] <= 1000
     * @param k -10^7 <= k <= 10^7
     */
    int subarraySum(int[] nums, int k);
}
