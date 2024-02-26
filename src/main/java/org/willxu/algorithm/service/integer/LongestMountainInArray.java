package org.willxu.algorithm.service.integer;

public interface LongestMountainInArray {
    /**
     * You may recall that an array arr is a mountain array if and only
     * if:
     * <p>
     * - arr.length >= 3
     * - There exists some index i (0-indexed) with
     *   0 < i < arr.length - 1 such that:
     *   - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     *   - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     * <p>
     * Given an integer array arr, return the length of the longest
     * subarray, which is a mountain. Return 0 if there is no mountain
     * subarray.
     *
     * @param arr 1 <= arr.length <= 10^4
     *            0 <= arr[i] <= 10^4
     */
    int longestMountain(int[] arr);
}
