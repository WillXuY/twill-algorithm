package org.willxu.algorithm.service.bool;

public interface ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at
     * least twice in the array, and return false if every element is
     * distinct.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     * @return contains duplicate or not
     */
    boolean containsDuplicate(int[] nums);
}
