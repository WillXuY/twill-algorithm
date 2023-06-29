package org.willxu.algorithm.service.empty;

public interface WiggleSortIi {
    /**
     * Given an integer array nums, reorder it such that
     * nums[0] < nums[1] > nums[2] < nums[3]....
     * <p>
     * You may assume the input array always has a valid answer.
     *
     * @param nums 1 <= nums.length <= 5 * 10^4
     *             0 <= nums[i] <= 5000
     *             It is guaranteed that there will be an answer for the
     *             given input nums.
     */
    void wiggleSort(int[] nums);
}
