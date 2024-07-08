package org.willxu.algorithm.service.integer;

public interface MaximumSumOfTwoNonOverlappingSubarrays {
    /**
     * Given an integer array nums and two integers firstLen and
     * secondLen, return the maximum sum of elements in two
     * non-overlapping subarrays with lengths firstLen and secondLen.
     * <p>
     * The array with length firstLen could occur before or after the
     * array with length secondLen, but they have to be non-overlapping.
     * <p>
     * A subarray is a contiguous part of an array.
     *
     * @param nums 0 <= nums[i] <= 1000
     * @param firstLen,secondLen 1 <= firstLen, secondLen <= 1000
     *                           2 <= firstLen + secondLen <= 1000
     *                           firstLen + secondLen <= nums.length <= 1000
     */
    int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen);
}
