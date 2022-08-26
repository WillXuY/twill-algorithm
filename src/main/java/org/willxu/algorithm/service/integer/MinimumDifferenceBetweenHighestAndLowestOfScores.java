package org.willxu.algorithm.service.integer;

public interface MinimumDifferenceBetweenHighestAndLowestOfScores {
    /**
     * You are given a 0-indexed integer array nums, where nums[i]
     * represents the score of the ith student. You are also given an
     * integer k.
     * <p>
     * Pick the scores of any k students from the array so that the
     * difference between the highest and the lowest of the k scores is
     * minimized.
     * <p>
     * Return the minimum possible difference.
     *
     * @param nums,k 1 <= k <= nums.length <= 1000
     *               0 <= nums[i] <= 105
     */
    int minimumDifference(int[] nums, int k);
}
