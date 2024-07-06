package org.willxu.algorithm.service.integer;

public interface TwoCityScheduling {
    /**
     * A company is planning to interview 2n people. Given the array
     * costs where costs[i] = [aCost_i, bCost_i], the cost of flying the
     * i^th person to city a is aCost_i, and the cost of flying the i^th
     * person to city b is bCost_i.
     * <p>
     * Return the minimum cost to fly every person to a city such that
     * exactly n people arrive in each city.
     *
     * @param costs 2 * n == costs.length
     *              2 <= costs.length <= 100
     *              costs.length is even.
     *              1 <= aCost_i, bCost_i <= 1000
     */
    int twoCitySchedCost(int[][] costs);
}
