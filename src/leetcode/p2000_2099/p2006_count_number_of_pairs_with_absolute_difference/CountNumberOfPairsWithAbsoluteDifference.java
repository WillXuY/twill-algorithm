package org.willxu.algorithm.service.integer;

public interface CountNumberOfPairsWithAbsoluteDifference {
    /**
     * Given an integer array nums and an integer k, return the number
     * of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
     * <p>
     * The value of |x| is defined as:
     * <p>
     * - x if x >= 0.
     * - -x if x < 0.
     *
     * @param nums 1 <= nums.length <= 200
     *             1 <= nums[i] <= 100
     * @param k 1 <= k <= 99
     */
    int countKDifference(int[] nums, int k);
}
