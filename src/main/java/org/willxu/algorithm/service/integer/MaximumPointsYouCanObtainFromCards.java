package org.willxu.algorithm.service.integer;

public interface MaximumPointsYouCanObtainFromCards {
    /**
     * There are several cards arranged in a row, and each card has an
     * associated number of points. The points are given in the integer
     * array cardPoints.
     * <p>
     * In one step, you can take one card from the beginning or from the
     * end of the row. You have to take exactly k cards.
     * <p>
     * Your score is the sum of the points of the cards you have taken.
     * <p>
     * Given the integer array cardPoints and the integer k, return the
     * maximum score you can obtain.
     *
     * @param cardPoints 1 <= cardPoints.length <= 10^5
     *                   1 <= cardPoints[i] <= 10^4
     * @param k 1 <= k <= cardPoints.length
     */
    int maxScore(int[] cardPoints, int k);
}
