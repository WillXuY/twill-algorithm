package org.willxu.algorithm.service.integer;

public interface KthMissingPositiveNumber {
    /**
     * Given an array arr of positive integers sorted in a strictly
     * increasing order, and an integer k.
     *
     * Find the kth positive integer that is missing from this array.
     *
     * @param arr 1 <= arr.length <= 1000
     *            1 <= arr[i] <= 1000
     *            arr[i] < arr[j] for 1 <= i < j <= arr.length
     * @param k 1 <= k <= 1000
     */
    int findKthPositive(int[] arr, int k);
}
