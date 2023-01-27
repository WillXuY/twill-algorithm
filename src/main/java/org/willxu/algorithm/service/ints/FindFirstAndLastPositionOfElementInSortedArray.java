package org.willxu.algorithm.service.ints;

public interface FindFirstAndLastPositionOfElementInSortedArray {
    /**
     * Given an array of integers nums sorted in non-decreasing order,
     * find the starting and ending position of a given target value.
     * <p>
     * If target is not found in the array, return [-1, -1].
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * @param nums 0 <= nums.length <= 105
     *             -109 <= nums[i] <= 109
     *             nums is a non-decreasing array.
     * @param target -109 <= target <= 109
     */
    int[] searchRange(int[] nums, int target);
}
