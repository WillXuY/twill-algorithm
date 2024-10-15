package org.willxu.algorithm.service.integer;

public interface CountNumberOfNiceSubarrays {
    /**
     * Given an array of integers nums and an integer k. A continuous
     * subarray is called nice if there are k odd numbers on it.
     * <p>
     * Return the number of nice sub-arrays.
     *
     * @param nums 1 <= nums.length <= 50000
     *             1 <= nums[i] <= 10^5
     * @param k 1 <= k <= nums.length
     */
    int numberOfSubarrays(int[] nums, int k);
}
