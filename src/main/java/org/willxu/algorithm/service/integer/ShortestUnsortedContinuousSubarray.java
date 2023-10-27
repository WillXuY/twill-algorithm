package org.willxu.algorithm.service.integer;

public interface ShortestUnsortedContinuousSubarray {
    /**
     * Given an integer array nums, you need to find one continuous
     * subarray such that if you only sort this subarray in
     * non-decreasing order, then the whole array will be sorted in
     * non-decreasing order.
     * <p>
     * Return the shortest such subarray and output its length.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^5 <= nums[i] <= 10^5
     */
    int findUnsortedSubarray(int[] nums);
}
