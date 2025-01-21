package org.willxu.algorithm.service.integer;

public interface LeastNumberOfUniqueIntegersAfterRemovals {
	/**
	 * Given an array of integers arr and an integer k. Find the least
	 * number of unique integers after removing exactly k elements.
	 * 
	 * @param arr 1 <= arr.length <= 10^5
	 *            1 <= arr[i] <= 10^9
	 * @param k 0 <= k <= arr.length
	 */
	int findLeastNumOfUniqueInts(int[] arr, int k);
}
