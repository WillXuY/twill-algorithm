package org.willxu.algorithm.service.integer;

public interface RemoveCoveredIntervals {
    /**
     * Given an array intervals where intervals[i] = [l_i, r_i]
     * represent the interval [l_i, r_i), remove all intervals that are
     * covered by another interval in the list.
     * <p>
     * The interval [a, b) is covered by the interval [c, d) if and only
     * if c <= a and b <= d.
     * <p>
     * Return the number of remaining intervals.
     *
     * @param intervals 1 <= intervals.length <= 1000
     *                  intervals[i].length == 2
     *                  0 <= l_i < r_i <= 10^5
     *                  All the given intervals are unique.
     */
    int removeCoveredIntervals(int[][] intervals);
}
