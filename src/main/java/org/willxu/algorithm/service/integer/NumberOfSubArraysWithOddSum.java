package org.willxu.algorithm.service.integer;

public interface NumberOfSubArraysWithOddSum {
	/**
	 * Given an array of integers arr, return the number of subarrays
	 * with an odd sum.
	 * <p>
	 * Since the answer can be very large, return it modulo 10^9 + 7.
	 * 
	 * @param arr 1 <= arr.length <= 10^5
	 *            1 <= arr[i] <= 100
	 */
int numOfSubarrays(int[] arr);
}
