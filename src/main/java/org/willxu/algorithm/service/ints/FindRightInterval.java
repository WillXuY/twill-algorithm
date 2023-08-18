package org.willxu.algorithm.service.ints;

public interface FindRightInterval {
    /**
     * You are given an array of intervals, where
     * intervals[i] = [start_i, end_i] and each start_i is unique.
     * <p>
     * The right interval for an interval i is an interval j such that
     * start_j >= end_i and start_j is minimized. Note that i may equal
     * j.
     * <p>
     * Return an array of right interval indices for each interval i. If
     * no right interval exists for interval i, then put -1 at index i.
     *
     * @param intervals 1 <= intervals.length <= 2 * 10^4
     *                  intervals[i].length == 2
     *                  -10^6 <= start_i <= end_i <= 10^6
     *                  The start point of each interval is unique.
     */
    int[] findRightInterval(int[][] intervals);
}
