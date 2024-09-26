package org.willxu.algorithm.service.integer;

public interface KconcatenationMaximumSum {
    /**
     * Given an integer array arr and an integer k, modify the array by
     * repeating it k times.
     * <p>
     * For example, if arr = [1, 2] and k = 3 then the modified array
     * will be [1, 2, 1, 2, 1, 2].
     * <p>
     * Return the maximum sub-array sum in the modified array. Note that
     * the length of the sub-array can be 0 and its sum in that case is
     * 0.
     * <p>
     * As the answer can be very large, return the answer modulo
     * 10^9 + 7.
     *
     * @param arr 1 <= arr.length <= 10^5
     *            -10^4 <= arr[i] <= 10^4
     * @param k 1 <= k <= 10^5
     */
    int kConcatenationMaxSum(int[] arr, int k);
}
