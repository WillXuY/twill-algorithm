package org.willxu.algorithm.service.integer;

public interface BestSightseeingPair {
    /**
     * You are given an integer array values where values[i] represents
     * the value of the i^th sightseeing spot. Two sightseeing spots i
     * and j have a distance j - i between them.
     * <p>
     * The score of a pair (i < j) of sightseeing spots is
     * values[i] + values[j] + i - j: the sum of the values of the
     * sightseeing spots, minus the distance between them.
     * <p>
     * Return the maximum score of a pair of sightseeing spots.
     *
     * @param values 2 <= values.length <= 5 * 10^4
     *               1 <= values[i] <= 1000
     */
    int maxScoreSightseeingPair(int[] values);
}
