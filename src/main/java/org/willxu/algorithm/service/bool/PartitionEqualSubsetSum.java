package org.willxu.algorithm.service.bool;

public interface PartitionEqualSubsetSum {
    /**
     * Given an integer array nums, return true if you can partition the
     * array into two subsets such that the sum of the elements in both
     * subsets is equal or false otherwise.
     *
     * @param nums 1 <= nums.length <= 200
     *             1 <= nums[i] <= 100
     */
    boolean canPartition(int[] nums);
}
