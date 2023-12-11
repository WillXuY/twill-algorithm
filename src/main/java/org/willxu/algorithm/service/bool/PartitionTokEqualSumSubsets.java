package org.willxu.algorithm.service.bool;

public interface PartitionTokEqualSumSubsets {
    /**
     * Given an integer array nums and an integer k, return true if it
     * is possible to divide this array into k non-empty subsets whose
     * sums are all equal.
     *
     * @param nums,k 1 <= k <= nums.length <= 16
     *               1 <= nums[i] <= 10^4
     *               The frequency of each element is in the range
     *               [1, 4].
     */
    boolean canPartitionKSubsets(int[] nums, int k);
}
