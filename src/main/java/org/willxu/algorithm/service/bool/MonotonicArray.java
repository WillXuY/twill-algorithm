package org.willxu.algorithm.service.bool;

public interface MonotonicArray {
    /**
     * An array is monotonic if it is either monotone increasing or
     * monotone decreasing.
     * An array nums is monotone increasing if for all i <= j,
     * nums[i] <= nums[j].
     * An array nums is monotone decreasing if for all i <= j,
     * nums[i] >= nums[j].
     * Given an integer array nums, return true if the given array is
     * monotonic, or false otherwise.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^5 <= nums[i] <= 10^5
     * @return nums is monotonic.
     */
    boolean isMonotonic(int[] nums);
}
