package org.willxu.algorithm.service.bool;

public interface CheckIfArrayPairsAreDivisibleByK {
	/**
	 * Given an array of integers arr of even length n and an integer k.
	 * <p>
	 * We want to divide the array into exactly n / 2 pairs such that
	 * the sum of each pair is divisible by k.
	 * <p>
	 * Return true If you can find a way to do that or false otherwise.
	 * 
	 * @param arr arr.length == n
	 *            1 <= n <= 10^5
	 *            n is even.
	 *            -10^9 <= arr[i] <= 10^9
	 * @param k 1 <= k <= 10^5
	 */
	boolean canArrange(int[] arr, int k);
}
