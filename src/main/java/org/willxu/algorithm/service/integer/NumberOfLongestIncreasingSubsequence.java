package org.willxu.algorithm.service.integer;

public interface NumberOfLongestIncreasingSubsequence {
    /**
     * Given an integer array nums, return the number of longest
     * increasing subsequences.
     * <p>
     * Notice that the sequence has to be strictly increasing.
     *
     * @param nums 1 <= nums.length <= 2000
     *             -10^6 <= nums[i] <= 10^6
     */
    int findNumberOfLIS(int[] nums);
}
