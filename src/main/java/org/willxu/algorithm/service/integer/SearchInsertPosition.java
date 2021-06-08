package org.willxu.algorithm.service.integer;

public interface SearchInsertPosition {
    /**
     * Given a sorted array of distinct integers and a target value,
     * return the index if the target is found. If not, return the
     * index where it would be if it were inserted in order.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * @param nums 1 <= nums.length <= 10^4;
     *             -10^4 <= nums[i] <= 10^4;
     *             nums contains distinct values sorted in ascending
     *             order.
     * @param target -10^4 <= target <= 10^4.
     * @return the index if the target is found.
     */
    int searchInsert(int[] nums, int target);
}
