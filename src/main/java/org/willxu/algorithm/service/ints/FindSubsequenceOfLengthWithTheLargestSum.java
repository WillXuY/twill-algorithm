package org.willxu.algorithm.service.ints;

public interface FindSubsequenceOfLengthWithTheLargestSum {
    /**
     * You are given an integer array nums and an integer k. You want to
     * find a subsequence of nums of length k that has the largest sum.
     * <p>
     * Return any such subsequence as an integer array of length k.
     * <p>
     * A subsequence is an array that can be derived from another array
     * by deleting some or no elements without changing the order of the
     * remaining elements.
     *
     * @param nums 1 <= nums.length <= 1000
     *             -105 <= nums[i] <= 105
     * @param k 1 <= k <= nums.length
     */
    int[] maxSubsequence(int[] nums, int k);
}
