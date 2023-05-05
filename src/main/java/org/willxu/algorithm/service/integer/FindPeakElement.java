package org.willxu.algorithm.service.integer;

public interface FindPeakElement {
    /**
     * A peak element is an element that is strictly greater than its
     * neighbors.
     * <p>
     * Given a 0-indexed integer array nums, find a peak element, and
     * return its index. If the array contains multiple peaks, return
     * the index to any of the peaks.
     * <p>
     * You may imagine that nums[-1] = nums[n] = -∞. In other words, an
     * element is always considered to be strictly greater than a
     * neighbor that is outside the array.
     * <p>
     * You must write an algorithm that runs in O(log n) time.
     *
     * @param nums 1 <= nums.length <= 1000
     *             -2^31 <= nums[i] <= 2^31 - 1
     *             nums[i] != nums[i + 1] for all valid i.
     */
    int findPeakElement(int[] nums);
}
