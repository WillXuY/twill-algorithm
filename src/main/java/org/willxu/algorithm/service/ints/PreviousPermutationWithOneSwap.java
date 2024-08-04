package org.willxu.algorithm.service.ints;

public interface PreviousPermutationWithOneSwap {
    /**
     * Given an array of positive integers arr (not necessarily
     * distinct), return the lexicographically largest permutation that
     * is smaller than arr, that can be made with exactly one swap. If
     * it cannot be done, then return the same array.
     * <p>
     * Note that a swap exchanges the positions of two numbers arr[i]
     * and arr[j]
     *
     * @param arr 1 <= arr.length <= 10^4
     *            1 <= arr[i] <= 10^4
     */
    int[] prevPermOpt1(int[] arr);
}
