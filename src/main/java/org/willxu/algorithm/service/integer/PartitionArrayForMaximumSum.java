package org.willxu.algorithm.service.integer;

public interface PartitionArrayForMaximumSum {
    /**
     * Given an integer array arr, partition the array into (contiguous)
     * subarrays of length at most k. After partitioning, each subarray
     * has their values changed to become the maximum value of that
     * subarray.
     * <p>
     * Return the largest sum of the given array after partitioning.
     * Test cases are generated so that the answer fits in a 32-bit
     * integer.
     *
     * @param arr 1 <= arr.length <= 500
     *            0 <= arr[i] <= 10^9
     * @param k 1 <= k <= arr.length
     */
    int maxSumAfterPartitioning(int[] arr, int k);
}
