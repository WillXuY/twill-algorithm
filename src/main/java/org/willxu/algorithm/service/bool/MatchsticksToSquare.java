package org.willxu.algorithm.service.bool;

public interface MatchsticksToSquare {
    /**
     * You are given an integer array matchsticks where matchsticks[i]
     * is the length of the ith matchstick. You want to use all the
     * matchsticks to make one square. You should not break any stick,
     * but you can link them up, and each matchstick must be used
     * exactly one time.
     * <p>
     * Return true if you can make this square and false otherwise.
     *
     * @param matchsticks 1 <= matchsticks.length <= 15
     *                    1 <= matchsticks[i] <= 10^8
     */
    boolean makesquare(int[] matchsticks);
}
