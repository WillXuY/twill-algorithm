package org.willxu.algorithm.service.integer;

public interface LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    /**
     * Given an array of integers nums and an integer limit, return the
     * size of the longest non-empty subarray such that the absolute
     * difference between any two elements of this subarray is less than
     * or equal to limit.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             1 <= nums[i] <= 10^9
     * @param limit 0 <= limit <= 10^9
     */
    int longestSubarray(int[] nums, int limit);
}
