package org.willxu.algorithm.service.bool;

public interface IncreasingTripletSubsequence {
    /**
     * Given an integer array nums, return true if there exists a triple
     * of indices (i, j, k) such that i < j < k and
     * nums[i] < nums[j] < nums[k]. If no such indices exists, return
     * false.
     *
     * @param nums 1 <= nums.length <= 5 * 10^5
     *             -2^31 <= nums[i] <= 2^31 - 1
     */
    boolean increasingTriplet(int[] nums);
}
