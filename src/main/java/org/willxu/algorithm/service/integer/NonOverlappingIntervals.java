package org.willxu.algorithm.service.integer;

public interface NonOverlappingIntervals {
    /**
     * Given an array of intervals intervals where
     * intervals[i] = [start_i, end_i], return the minimum number of
     * intervals you need to remove to make the rest of the intervals
     * non-overlapping.
     *
     * @param intervals 1 <= intervals.length <= 10^5
     *                  intervals[i].length == 2
     *                  -5 * 10^4 <= start_i < end_i <= 5 * 10^4
     */
    int eraseOverlapIntervals(int[][] intervals);
}
