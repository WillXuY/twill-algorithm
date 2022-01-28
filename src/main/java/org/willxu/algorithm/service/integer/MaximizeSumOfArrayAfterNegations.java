package org.willxu.algorithm.service.integer;

public interface MaximizeSumOfArrayAfterNegations {
    /**
     * Given a integer array nums and integer k, modify the array in the
     * following way:
     * - choose an index i and replace nums[i] with -nums[i].
     * You should apply this process exactly k times. You may choose the
     * same index i multiple times.
     * Return the largest possible sum of the array after modifying it
     * in this way.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -100 <= nums[i] <= 100
     * @param k 1 <= k <= 10^4
     * @return largest sum after kth negations.
     */
    int largestSumAfterKNegations(int[] nums, int k);
}
