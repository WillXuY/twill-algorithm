package org.willxu.algorithm.service.matrix;

public interface InsertInterval {
    /**
     * You are given an array of non-overlapping intervals intervals
     * where intervals[i] = [start_i, end_i] represent the start and the
     * end of the ith interval and intervals is sorted in ascending
     * order by start_i. You are also given an interval newInterval =
     * [start, end] that represents the start and end of another interval
     * <p>
     * Insert newInterval into intervals such that intervals is still
     * sorted in ascending order by start_i and intervals still does not
     * have any overlapping intervals (merge overlapping intervals if
     * necessary).
     * <p>
     * Return intervals after the insertion.
     *
     * @param intervals 0 <= intervals.length <= 10^4
     *                  intervals[i].length == 2
     *                  0 <= start_i <= end_i <= 105
     *                  intervals is sorted by start_i in ascending order.
     * @param newInterval newInterval.length == 2
     *                    0 <= start <= end <= 105
     */
    int[][] insert(int[][] intervals, int[] newInterval);
}
