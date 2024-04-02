package org.willxu.algorithm.service.integer;

public interface SmallestRangeIi {
    /**
     * You are given an integer array nums and an integer k.
     * <p>
     * For each index i where 0 <= i < nums.length, change nums[i] to
     * be either nums[i] + k or nums[i] - k.
     * <p>
     * The score of nums is the difference between the maximum and
     * minimum elements in nums.
     * <p>
     * Return the minimum score of nums after changing the values at
     * each index.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             0 <= nums[i] <= 10^4
     * @param k 0 <= k <= 10^4
     */
    int smallestRangeII(int[] nums, int k);
}
