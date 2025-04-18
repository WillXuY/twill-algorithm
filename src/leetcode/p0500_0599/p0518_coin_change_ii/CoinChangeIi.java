package leetcode.p0500_0599.p0518_coin_change_ii;

public interface CoinChangeIi {
    /**
     * You are given an integer array coins representing coins of
     * different denominations and an integer amount representing a
     * total amount of money.
     * <p>
     * Return the number of combinations that make up that amount. If
     * that amount of money cannot be made up by any combination of the
     * coins, return 0.
     * <p>
     * You may assume that you have an infinite number of each kind of
     * coin.
     * <p>
     * The answer is guaranteed to fit into a signed 32-bit integer.
     *
     * @param amount 0 <= amount <= 5000
     * @param coins 1 <= coins[i] <= 5000
     *              All the values of coins are unique.
     *              1 <= coins.length <= 300
     */
    int change(int amount, int[] coins);
}
