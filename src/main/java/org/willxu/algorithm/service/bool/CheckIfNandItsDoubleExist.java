package org.willxu.algorithm.service.bool;

public interface CheckIfNandItsDoubleExist {
    /**
     * Given an array arr of integers, check if there exists two
     * integers N and M such that N is the double of M (i.e. N = 2 * M).
     * More formally check if there exists two indices i and j such
     * that:
     * - i != j
     * - 0 <= i, j < arr.length
     * - arr[i] == 2 * arr[j]
     *
     * @param arr 2 <= arr.length <= 500
     *            -10^3 <= arr[i] <= 10^3
     * @return if n and 2n is existed
     */
    boolean checkIfExist(int[] arr);
}
