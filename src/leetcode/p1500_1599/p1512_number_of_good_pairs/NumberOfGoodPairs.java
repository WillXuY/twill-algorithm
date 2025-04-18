package org.willxu.algorithm.service.integer;

public interface NumberOfGoodPairs {
    /**
     * Given an array of integers nums, return the number of good pairs.
     *
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     *
     * @param nums 1 <= nums.length <= 100
     *             1 <= nums[i] <= 100
     */
    int numIdenticalPairs(int[] nums);
}
