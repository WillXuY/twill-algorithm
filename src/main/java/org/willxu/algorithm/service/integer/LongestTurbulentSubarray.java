package org.willxu.algorithm.service.integer;

public interface LongestTurbulentSubarray {
    /**
     * Given an integer array arr, return the length of a maximum size
     * turbulent subarray of arr.
     * <p>
     * A subarray is turbulent if the comparison sign flips between each
     * adjacent pair of elements in the subarray.
     * <p>
     * More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of
     * arr is said to be turbulent if and only if:
     * <p>
     * - For i <= k < j:
     *   - arr[k] > arr[k + 1] when k is odd, and
     *   - arr[k] < arr[k + 1] when k is even.
     * - Or, for i <= k < j:
     *   - arr[k] > arr[k + 1] when k is even, and
     *   - arr[k] < arr[k + 1] when k is odd.
     *
     * @param arr 1 <= arr.length <= 4 * 10^4
     *            0 <= arr[i] <= 10^9
     */
    int maxTurbulenceSize(int[] arr);
}
