package org.willxu.algorithm.service.ints;

public interface KthSmallestPrimeFraction {
    /**
     * You are given a sorted integer array arr containing 1 and prime
     * numbers, where all the integers of arr are unique. You are also
     * given an integer k.
     * <p>
     * For every i and j where 0 <= i < j < arr.length, we consider the
     * fraction arr[i] / arr[j].
     * <p>
     * Return the k^th smallest fraction considered. Return your answer
     * as an array of integers of size 2, where answer[0] == arr[i] and
     * answer[1] == arr[j].
     *
     * @param arr 2 <= arr.length <= 1000
     *            1 <= arr[i] <= 3 * 10^4
     *            arr[0] == 1
     *            arr[i] is a prime number for i > 0.
     *            All the numbers of arr are unique and sorted in
     *            strictly increasing order.
     * @param k 1 <= k <= arr.length * (arr.length - 1) / 2
     */
    int[] kthSmallestPrimeFraction(int[] arr, int k);
}
