package org.willxu.algorithm.service.integer;

public interface NumberOfSubarraysWithBoundedMaximum {
    /**
     * Given an integer array nums and two integers left and right,
     * return the number of contiguous non-empty subarrays such that the
     * value of the maximum array element in that subarray is in the
     * range [left, right].
     * <p>
     * The test cases are generated so that the answer will fit in a
     * 32-bit integer.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             0 <= nums[i] <= 10^9
     * @param left,right 0 <= left <= right <= 10^9
     */
    int numSubarrayBoundedMax(int[] nums, int left, int right);
}
