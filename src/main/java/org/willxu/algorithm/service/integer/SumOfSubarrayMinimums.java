package org.willxu.algorithm.service.integer;

public interface SumOfSubarrayMinimums {
    /**
     * Given an array of integers arr, find the sum of min(b), where b
     * ranges over every (contiguous) subarray of arr. Since the answer
     * may be large, return the answer modulo 10^9 + 7.
     *
     * @param arr 1 <= arr.length <= 3 * 10^4
     *            1 <= arr[i] <= 3 * 10^4
     */
    int sumSubarrayMins(int[] arr);
}
