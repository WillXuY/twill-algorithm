package org.willxu.algorithm.service.integer;

public interface FindLatestGroupOfSizeM {
	/**
	 * Given an array arr that represents a permutation of numbers from
	 * 1 to n.
	 * <p>
	 * You have a binary string of size n that initially has all its
	 * bits set to zero. At each step i (assuming both the binary
	 * string and arr are 1-indexed) from 1 to n, the bit at position
	 * arr[i] is set to 1.
	 * <p>
	 * You are also given an integer m. Find the latest step at which
	 * there exists a group of ones of length m. A group of ones is a
	 * contiguous substring of 1's such that it cannot be extended in
	 * either direction.
	 * <p>
	 * Return the latest step at which there exists a group of ones of
	 * length exactly m. If no such group exists, return -1.
	 * 
	 * @param arr n == arr.length
	 *            1 <= arr[i] <= n
	 *            All integers in arr are distinct.
	 * @param m 1 <= m <= n <= 10^5
	 */
	int findLatestStep(int[] arr, int m);
}
