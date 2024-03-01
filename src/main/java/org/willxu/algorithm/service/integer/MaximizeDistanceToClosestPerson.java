package org.willxu.algorithm.service.integer;

public interface MaximizeDistanceToClosestPerson {
    /**
     * You are given an array representing a row of seats where
     * seats[i] = 1 represents a person sitting in the i^th seat, and
     * seats[i] = 0 represents that the i^th seat is empty (0-indexed).
     * <p>
     * There is at least one empty seat, and at least one person
     * sitting.
     * <p>
     * Alex wants to sit in the seat such that the distance between him
     * and the closest person to him is maximized.
     * <p>
     * Return that maximum distance to the closest person.
     *
     * @param seats 2 <= seats.length <= 2 * 10^4
     *              seats[i] is 0 or 1.
     *              At least one seat is empty.
     *              At least one seat is occupied.
     */
    int maxDistToClosest(int[] seats);
}
