package org.willxu.algorithm.service.integer;

public interface ContiguousArray {
    /**
     * Given a binary array nums, return the maximum length of a
     * contiguous subarray with an equal number of 0 and 1.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             nums[i] is either 0 or 1.
     */
    int findMaxLength(int[] nums);
}
