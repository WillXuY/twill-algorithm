package org.willxu.algorithm.service.ints;

public interface XorQueriesOfSubarray {
    /**
     * You are given an array arr of positive integers. You are also
     * given the array queries where queries[i] = [left_i, right_i].
     * <p>
     * For each query i compute the XOR of elements from left_i to
     * right_i (that is, arr[left_i] XOR arr[left_i + 1] XOR ... XOR
     * arr[right_i] ).
     * <p>
     * Return an array answer where answer[i] is the answer to the i^th
     * query.
     *
     * @param arr 1 <= arr.length, queries.length <= 3 * 10^4
     *            1 <= arr[i] <= 10^9
     * @param queries queries[i].length == 2
     *                0 <= left_i <= right_i < arr.length
     */
    int[] xorQueries(int[] arr, int[][] queries);
}
