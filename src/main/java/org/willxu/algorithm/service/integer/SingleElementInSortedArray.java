package org.willxu.algorithm.service.integer;

public interface SingleElementInSortedArray {
    /**
     * You are given a sorted array consisting of only integers where
     * every element appears exactly twice, except for one element which
     * appears exactly once.
     * <p>
     * Return the single element that appears only once.
     * <p>
     * Your solution must run in O(log n) time and O(1) space.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             0 <= nums[i] <= 10^5
     */
    int singleNonDuplicate(int[] nums);
}
