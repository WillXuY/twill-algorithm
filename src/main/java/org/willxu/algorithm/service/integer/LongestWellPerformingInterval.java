package org.willxu.algorithm.service.integer;

public interface LongestWellPerformingInterval {
    /**
     * We are given hours, a list of the number of hours worked per day
     * for a given employee.
     * <p>
     * A day is considered to be a tiring day if and only if the number
     * of hours worked is (strictly) greater than 8.
     * <p>
     * A well-performing interval is an interval of days for which the
     * number of tiring days is strictly larger than the number of
     * non-tiring days.
     * <p>
     * Return the length of the longest well-performing interval.
     *
     * @param hours 1 <= hours.length <= 10^4
     *              0 <= hours[i] <= 16
     */
    int longestWPI(int[] hours);
}
