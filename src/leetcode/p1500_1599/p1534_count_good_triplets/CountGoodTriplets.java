package org.willxu.algorithm.service.integer;

public interface CountGoodTriplets {
    /**
     * Given an array of integers arr, and three integers a, b and c.
     * You need to find the number of good triplets.
     *
     * A triplet (arr[i], arr[j], arr[k]) is good if the following
     * conditions are true:
     *
     * - 0 <= i < j < k < arr.length
     * - |arr[i] - arr[j]| <= a
     * - |arr[j] - arr[k]| <= b
     * - |arr[i] - arr[k]| <= c
     *
     * Where |x| denotes the absolute value of x.
     *
     * Return the number of good triplets.
     *
     * @param arr 3 <= arr.length <= 100
     *            0 <= arr[i] <= 1000
     * @param a,b,c 0 <= a, b, c <= 1000
     */
    int countGoodTriplets(int[] arr, int a, int b, int c);
}
