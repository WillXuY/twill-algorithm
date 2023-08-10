package org.willxu.algorithm.service.integer;

public interface MaximumXorOfTwoNumbersInAnArray {
    /**
     * Given an integer array nums, return the maximum result of nums[i]
     * XOR nums[j], where 0 <= i <= j < n.
     *
     * @param nums 1 <= nums.length <= 2 * 10^5
     *             0 <= nums[i] <= 2^31 - 1
     */
    int findMaximumXOR(int[] nums);
}
