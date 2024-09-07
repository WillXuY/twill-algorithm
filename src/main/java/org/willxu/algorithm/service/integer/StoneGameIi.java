package org.willxu.algorithm.service.integer;

public interface StoneGameIi {
    /**
     * Alice and Bob continue their games with piles of stones. There
     * are a number of piles arranged in a row, and each pile has a
     * positive integer number of stones piles[i]. The objective of the
     * game is to end with the most stones.
     * <p>
     * Alice and Bob take turns, with Alice starting first.
     * <p>
     * On each player's turn, that player can take all the stones in the
     * first X remaining piles, where 1 <= X <= 2M. Then, we set
     * M = max(M, X). Initially, M = 1.
     * <p>
     * The game continues until all the stones have been taken.
     * <p>
     * Assuming Alice and Bob play optimally, return the maximum number
     * of stones Alice can get.
     *
     * @param piles 1 <= piles.length <= 100
     *              1 <= piles[i] <= 10^4
     */
    int stoneGameII(int[] piles);
}
