package org.willxu.algorithm.service.string;

public interface BestPokerHand {
    String FLUSH = "Flush";
    String THREE = "Three of a King";
    String PAIR = "Pair";
    String HIGH_CARD = "High Card";

    /**
     * You are given an integer array ranks and a character array suits.
     * You have 5 cards where the ith card has a rank of ranks[i] and a
     * suit of suits[i].
     *
     * The following are the types of poker hands you can make from best
     * to worst:
     *
     * 1. "Flush": Five cards of the same suit.
     * 2. "Three of a Kind": Three cards of the same rank.
     * 3. "Pair": Two cards of the same rank.
     * 4. "High Card": Any single card.
     *
     * Return a string representing the best type of poker hand you can
     * make with the given cards.
     *
     * Note that the return values are case-sensitive.
     *
     * @param ranks ranks.length == suits.length == 5
     *              1 <= ranks[i] <= 13
     *              No two cards have the same rank and suit.
     * @param suits 'a' <= suits[i] <= 'd'
     *              No two cards have the same rank and suit.
     */
    String bestHand(int[] ranks, char[] suits);
}
