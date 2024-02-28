package org.willxu.algorithm.service.bool;

public interface HandOfStraights {
    /**
     * Alice has some number of cards and she wants to rearrange the
     * cards into groups so that each group is of size groupSize, and
     * consists of groupSize consecutive cards.
     * <p>
     * Given an integer array hand where hand[i] is the value written on
     * the i^th card and an integer groupSize, return true if she can
     * rearrange the cards, or false otherwise.
     *
     * @param hand 1 <= hand.length <= 10^4
     *             0 <= hand[i] <= 10^9
     * @param groupSize 1 <= groupSize <= hand.length
     */
    boolean isNStraightHand(int[] hand, int groupSize);
}
