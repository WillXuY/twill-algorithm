package org.willxu.algorithm.service.integer;

public interface CardFlippingGame {
    /**
     * You are given two 0-indexed integer arrays fronts and backs of
     * length n, where the i^th card has the positive integer fronts[i]
     * printed on the front and backs[i] printed on the back. Initially,
     * each card is placed on a table such that the front number is
     * facing up and the other is facing down. You may flip over any
     * number of cards (possibly zero).
     * <p>
     * After flipping the cards, an integer is considered good if it is
     * facing down on some card and not facing up on any card.
     * <p>
     * Return the minimum possible good integer after flipping the cards.
     * If there are no good integers, return 0.
     *
     * @param fronts,backs n == fronts.length == backs.length
     *                     1 <= n <= 1000
     *                     1 <= fronts[i], backs[i] <= 2000
     */
    int flipgame(int[] fronts, int[] backs);
}
