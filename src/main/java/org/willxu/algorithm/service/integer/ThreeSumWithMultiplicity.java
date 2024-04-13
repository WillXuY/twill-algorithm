package org.willxu.algorithm.service.integer;

public interface ThreeSumWithMultiplicity {
    /**
     * Given an integer array arr, and an integer target, return the
     * number of tuples i, j, k such that i < j < k and
     * arr[i] + arr[j] + arr[k] == target.
     * <p>
     * As the answer can be very large, return it modulo 10^9 + 7.
     *
     * @param arr 3 <= arr.length <= 3000
     *            0 <= arr[i] <= 100
     * @param target 0 <= target <= 300
     */
    int threeSumMulti(int[] arr, int target);
}
