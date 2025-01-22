package org.willxu.algorithm.service.integer;

public interface MinimumNumberOfDaysToMakeBouquets {
	/**
	 * You are given an integer array bloomDay, an integer m and an
	 * integer k.
	 * <p>
	 * You want to make m bouquets. To make a bouquet, you need to use k
	 * adjacent flowers from the garden.
	 * <p>
	 * The garden consists of n flowers, the i^th flower will bloom in
	 * the bloomDay[i] and then can be used in exactly one bouquet.
	 * <p>
	 * Return the minimum number of days you need to wait to be able to
	 * make m bouquets from the garden. If it is impossible to make m
	 * bouquets return -1.
	 * 
	 * @param bloomDay bloomDay.length == n
	 *                 1 <= n <= 10^5
	 *                 1 <= bloomDay[i] <= 10^9
	 * @param m 1 <= m <= 10^6
	 * @param k 1 <= k <= n
	 */
	int minDays(int[] bloomDay, int m, int k);
}
