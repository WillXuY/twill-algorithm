package org.willxu.algorithm.service.ints;

public interface SortArrayByParity {
    /**
     * Given an integer array nums, move all the even integers at the
     * beginning of the array followed by all the odd integers.
     * Return any array that satisfies this condition.
     *
     * @param nums 1 <= nums.length <= 5000
     *             0 <= nums[i] <= 5000
     * @return sorted array from nums.
     */
    int[] sortArrayByParity(int[] nums);
}
