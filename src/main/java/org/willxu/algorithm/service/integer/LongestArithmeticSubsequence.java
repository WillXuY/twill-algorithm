package org.willxu.algorithm.service.integer;

public interface LongestArithmeticSubsequence {
    /**
     * Given an array nums of integers, return the length of the longest
     * arithmetic subsequence in nums.
     * <p>
     * Note that:
     * <p>
     * - A subsequence is an array that can be derived from another
     *   array by deleting some or no elements without changing the
     *   order of the remaining elements.
     * - A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the
     *   same value (for 0 <= i < seq.length - 1).
     *
     * @param nums 2 <= nums.length <= 1000
     *             0 <= nums[i] <= 500
     */
    int longestArithSeqLength(int[] nums);
}
