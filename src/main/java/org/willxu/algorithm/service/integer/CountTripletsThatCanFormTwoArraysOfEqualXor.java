package org.willxu.algorithm.service.integer;

public interface CountTripletsThatCanFormTwoArraysOfEqualXor {
    /**
     * Given an array of integers arr.
     * <p>
     * We want to select three indices i, j and k where
     * (0 <= i < j <= k < arr.length).
     * <p>
     * Let's define a and b as follows:
     * <p>
     * - a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
     * - b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
     * <p>
     * Note that ^ denotes the bitwise-xor operation.
     * <p>
     * Return the number of triplets (i, j and k) Where a == b.
     *
     * @param arr 1 <= arr.length <= 300
     *            1 <= arr[i] <= 10^8
     */
    int countTriplets(int[] arr);
}
