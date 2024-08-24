package org.willxu.algorithm.service.ints;

public interface CorporateFlightBookings {
    /**
     * There are n flights that are labeled from 1 to n.
     * <p>
     * You are given an array of flight bookings bookings, where
     * bookings[i] = [first_i, last_i, seats_i] represents a booking for
     * flights first_i through last_i (inclusive) with seats_i seats
     * reserved for each flight in the range.
     * <p>
     * Return an array answer of length n, where answer[i] is the total
     * number of seats reserved for flight i.
     *
     * @param bookings 1 <= bookings.length <= 2 * 10^4
     *                 bookings[i].length == 3
     *                 1 <= first_i <= last_i <= n
     *                 1 <= seats_i <= 10^4
     * @param n 1 <= n <= 2 * 10^4
     */
    int[] corpFlightBookings(int[][] bookings, int n);
}
