package org.willxu.algorithm.service.integer;

public interface MostFrequentEvenElement {
    /**
     * Given an integer array nums, return the most frequent even
     * element.
     * <p>
     * If there is a tie, return the smallest one. If there is no such
     * element, return -1.
     *
     * @param nums 1 <= nums.length <= 2000
     *             0 <= nums[i] <= 105
     */
    int mostFrequentEven(int[] nums);
}
