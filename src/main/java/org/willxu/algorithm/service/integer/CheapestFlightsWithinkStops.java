package org.willxu.algorithm.service.integer;

public interface CheapestFlightsWithinkStops {
    /**
     * There are n cities connected by some number of flights. You are
     * given an array flights where flights[i] = [from_i, to_i, price_i]
     * indicates that there is a flight from city from_i to city toi
     * with cost price_i.
     * <p>
     * You are also given three integers src, dst, and k, return the
     * cheapest price from src to dst with at most k stops. If there is
     * no such route, return -1.
     *
     * @param n 1 <= n <= 100
     * @param flights 0 <= flights.length <= (n * (n - 1) / 2)
     *                flights[i].length == 3
     *                0 <= from_i, to_i < n
     *                from_i != toi
     *                1 <= price_i <= 104
     *                There will not be any multiple flights between two
     *                cities.
     * @param src,dst 0 <= src, dst, k < n
     *                src != dst
     */
    int findCheapestPrice(int n, int[][] flights, int src, int dst, int k);
}
