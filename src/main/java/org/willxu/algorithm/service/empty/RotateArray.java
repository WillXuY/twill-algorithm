package org.willxu.algorithm.service.empty;

public interface RotateArray {
    /**
     * Given an integer array nums, rotate the array to the right by k
     * steps, where k is non-negative.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -2^31 <= nums[i] <= 2^31 - 1
     * @param k 0 <= k <= 10^5
     */
    void rotate(int[] nums, int k);
}
