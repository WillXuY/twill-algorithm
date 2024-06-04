package org.willxu.algorithm.service.ints;

public interface SumOfEvenNumbersAfterQueries {
    /**
     * You are given an integer array nums and an array queries where
     * queries[i] = [val_i, index_i].
     * <p>
     * For each query i, first, apply
     * nums[index_i] = nums[index_i] + val_i, then print the sum of the
     * even values of nums.
     * <p>
     * Return an integer array answer where answer[i] is the answer to
     * the i^th query.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^4 <= nums[i] <= 10^4
     *             0 <= index_i < nums.length
     * @param queries 1 <= queries.length <= 10^4
     *                -10^4 <= val_i <= 10^4
     */
    int[] sumEvenAfterQueries(int[] nums, int[][] queries);
}
