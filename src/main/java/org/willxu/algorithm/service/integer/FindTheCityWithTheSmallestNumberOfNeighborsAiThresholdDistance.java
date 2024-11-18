package org.willxu.algorithm.service.integer;

public interface FindTheCityWithTheSmallestNumberOfNeighborsAiThresholdDistance {
    /**
     * There are n cities numbered from 0 to n-1. Given the array edges
     * where edges[i] = [from_i, to_i, weight_i] represents a
     * bidirectional and weighted edge between cities from_i and to_i,
     * and given the integer distanceThreshold.
     * <p>
     * Return the city with the smallest number of cities that are
     * reachable through some path and whose distance is at most
     * distanceThreshold, If there are multiple such cities, return the
     * city with the greatest number.
     * <p>
     * Notice that the distance of a path connecting cities i and j is
     * equal to the sum of the edges' weights along that path.
     *
     * @param n 2 <= n <= 100
     * @param edges 1 <= edges.length <= n * (n - 1) / 2
     *              edges[i].length == 3
     *              0 <= from_i < to_i < n
     *              All pairs (from_i, to_i) are distinct.
     * @param distanceThreshold 1 <= weight_i, distanceThreshold <= 10^4
     */
    int findTheCity(int n, int[][] edges, int distanceThreshold);
}
