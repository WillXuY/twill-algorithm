package org.willxu.algorithm.service.integer;

public interface LengthOfLongestFibonacciSubsequence {
    /**
     * A sequence x_1, x_2, ..., x_n is Fibonacci-like if:
     * <p>
     * - n >= 3
     * - x_i + x_(i+1) == x_(i+2) for all i + 2 <= n
     * <p>
     * Given a strictly increasing array arr of positive integers
     * forming a sequence, return the length of the longest
     * Fibonacci-like subsequence of arr. If one does not exist,
     * return 0.
     * <p>
     * A subsequence is derived from another sequence arr by deleting
     * any number of elements (including none) from arr, without
     * changing the order of the remaining elements. For example,
     * [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].
     *
     * @param arr 3 <= arr.length <= 1000
     *            1 <= arr[i] < arr[i + 1] <= 10^9
     */
    int lenLongestFibSubseq(int[] arr);
}
