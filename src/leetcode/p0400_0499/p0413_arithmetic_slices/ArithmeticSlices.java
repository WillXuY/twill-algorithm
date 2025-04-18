package org.willxu.algorithm.service.integer;

public interface ArithmeticSlices {
    /**
     * An integer array is called arithmetic if it consists of at least
     * three elements and if the difference between any two consecutive
     * elements is the same.
     * <p>
     * For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are
     * arithmetic sequences.
     * <p>
     * Given an integer array nums, return the number of arithmetic
     * subarrays of nums.
     * <p>
     * A subarray is a contiguous subsequence of the array.
     *
     * @param nums 1 <= nums.length <= 5000
     *             -1000 <= nums[i] <= 1000
     */
    int numberOfArithmeticSlices(int[] nums);
}
