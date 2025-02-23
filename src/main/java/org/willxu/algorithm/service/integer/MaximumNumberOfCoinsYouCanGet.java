package org.willxu.algorithm.service.integer;

public interface MaximumNumberOfCoinsYouCanGet {
	/**
	 * There are 3n piles of coins of varying size, you and your friends
	 * will take piles of coins as follows:
	 * <p>
     * - In each step, you will choose any 3 piles of coins (not
     *   necessarily consecutive).
     * - Of your choice, Alice will pick the pile with the maximum
     *   number of coins.
     * - You will pick the next pile with the maximum number of coins.
     * - Your friend Bob will pick the last pile.
     * - Repeat until there are no more piles of coins.
     * <p>
     * Given an array of integers piles where piles[i] is the number of
     * coins in the i^th pile.
     * <p>
     * Return the maximum number of coins that you can have. 
	 * 
	 * @param piles 3 <= piles.length <= 10^5
	 *              piles.length % 3 == 0
	 *              1 <= piles[i] <= 10^4
	 */
	int maxCoins(int[] piles);
}
