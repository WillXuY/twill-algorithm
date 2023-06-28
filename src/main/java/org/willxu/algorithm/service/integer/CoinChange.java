package org.willxu.algorithm.service.integer;

public interface CoinChange {
    /**
     * You are given an integer array coins representing coins of
     * different denominations and an integer amount representing a
     * total amount of money.
     * <p>
     * Return the fewest number of coins that you need to make up that
     * amount. If that amount of money cannot be made up by any
     * combination of the coins, return -1.
     * <p>
     * You may assume that you have an infinite number of each kind of
     * coin.
     *
     * @param coins 1 <= coins.length <= 12
     *              1 <= coins[i] <= 2^31 - 1
     * @param amount 0 <= amount <= 10^4
     */
    int coinChange(int[] coins, int amount);
}
