package org.willxu.algorithm.service.integer;

public interface RemoveDuplicatesFromSortedArray {
    /**
     * Given a sorted array nums, remove the duplicates in-place such
     * that each element appears only once and returns the new length.
     * Do not allocate extra space for another array, you must do this
     * by modifying the input array in-place with O(1) extra memory.
     *
     * Clarification:
     * Confused why the return value is an integer but you answer is an
     * array?
     * Note that the input array is passed in by reference, which means
     * a modification to the input array will be know to the caller as
     * well.
     * @param nums 0 <= nums.length <= 3 * 10^4
     *             -10^4 <= nums[i] <= 10^4
     *             nums is sorted in ascending order.
     * @return return the length of array that each element appears
     *         only once.
     */
    int removeDuplicates(int[] nums);
}
