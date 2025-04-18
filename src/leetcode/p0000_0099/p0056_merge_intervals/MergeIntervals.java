package org.willxu.algorithm.service.matrix;

public interface MergeIntervals {
    /**
     * Given an array of intervals where intervals[i] =
     * [start_i, end_i], merge all overlapping intervals, and return an
     * array of the non-overlapping intervals that cover all the
     * intervals in the input.
     *
     * @param intervals 1 <= intervals.length <= 104
     *                  intervals[i].length == 2
     *                  0 <= start_i <= end_i <= 104
     */
    int[][] merge(int[][] intervals);
}
