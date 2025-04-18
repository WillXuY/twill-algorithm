package org.willxu.algorithm.service.integer;

public interface SumOfAllOddLengthSubarrays {
    /**
     * Given an array of positive integers arr, calculate the sum of all
     * possible odd-length subarrays.
     *
     * A subarray is a contiguous subsequence of the array.
     *
     * Return the sum of all odd-length subarrays of arr.
     *
     * @param arr 1 <= arr.length <= 100
     *            1 <= arr[i] <= 1000
     */
    int sumOddLengthSubarrays(int[] arr);
}
