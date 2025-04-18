package org.willxu.algorithm.service.integer;

public interface LastStoneWeightIi {
    /**
     * You are given an array of integers stones where stones[i] is the
     * weight of the i^th stone.
     * <p>
     * We are playing a game with the stones. On each turn, we choose
     * any two stones and smash them together. Suppose the stones have
     * weights x and y with x <= y. The result of this smash is:
     * <p>
     * - If x == y, both stones are destroyed, and
     * - If x != y, the stone of weight x is destroyed, and the stone of
     *   weight y has new weight y - x.
     * <p>
     * At the end of the game, there is at most one stone left.
     * <p>
     * Return the smallest possible weight of the left stone. If there
     * are no stones left, return 0.
     *
     * @param stones 1 <= stones.length <= 30
     *               1 <= stones[i] <= 100
     */
    int lastStoneWeightII(int[] stones);
}
