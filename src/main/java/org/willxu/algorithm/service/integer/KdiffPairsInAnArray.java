package org.willxu.algorithm.service.integer;

public interface KdiffPairsInAnArray {
    /**
     * Given an array of integers nums and an integer k, return the
     * number of unique k-diff pairs in the array.
     * <p>
     * A k-diff pair is an integer pair (nums[i], nums[j]), where the
     * following are true:
     * <p>
     * - 0 <= i, j < nums.length
     * - i != j
     * - |nums[i] - nums[j]| == k
     * <p>
     * Notice that |val| denotes the absolute value of val.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^7 <= nums[i] <= 10^7
     * @param k 0 <= k <= 10^7
     */
    int findPairs(int[] nums, int k);
}
