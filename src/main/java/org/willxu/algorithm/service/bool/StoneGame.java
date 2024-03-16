package org.willxu.algorithm.service.bool;

public interface StoneGame {
    /**
     * Alice and Bob play a game with piles of stones. There are an even
     * number of piles arranged in a row, and each pile has a positive
     * integer number of stones piles[i].
     * <p>
     * The objective of the game is to end with the most stones. The
     * total number of stones across all the piles is odd, so there are
     * no ties.
     * <p>
     * Alice and Bob take turns, with Alice starting first. Each turn,
     * a player takes the entire pile of stones either from the
     * beginning or from the end of the row. This continues until there
     * are no more piles left, at which point the person with the most
     * stones wins.
     * <p>
     * Assuming Alice and Bob play optimally, return true if Alice wins
     * the game, or false if Bob wins.
     *
     * @param piles 2 <= piles.length <= 500
     *              piles.length is even.
     *              1 <= piles[i] <= 500
     *              sum(piles[i]) is odd.
     */
    boolean stoneGame(int[] piles);
}
