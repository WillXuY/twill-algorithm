package org.willxu.algorithm.service.integer;

public interface TheKthFactorOfN {
	/**
	 * You are given two positive integers n and k. A factor of an
	 * integer n is defined as an integer i where n % i == 0.
	 * <p>
	 * Consider a list of all factors of n sorted in ascending order,
	 * return the k^th factor in this list or return -1 if n has less
	 * than k factors.
	 * 
	 * @param n,k 1 <= k <= n <= 1000
	 */
	int kthFactor(int n, int k);
}
