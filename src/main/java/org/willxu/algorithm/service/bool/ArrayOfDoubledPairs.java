package org.willxu.algorithm.service.bool;

public interface ArrayOfDoubledPairs {
    /**
     * Given an integer array of even length arr, return true if it is
     * possible to reorder arr such that arr[2 * i + 1] = 2 * arr[2 * i]
     * for every 0 <= i < len(arr) / 2, or false otherwise.
     *
     * @param arr 2 <= arr.length <= 3 * 10^4
     *            arr.length is even.
     *            -10^5 <= arr[i] <= 10^5
     */
    boolean canReorderDoubled(int[] arr);
}
