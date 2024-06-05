package org.willxu.algorithm.service.ints;

public interface IntervalListIntersections {
    /**
     * You are given two lists of closed intervals, firstList and
     * secondList, where firstList[i] = [start_i, end_i] and
     * secondList[j] = [start_j, end_j]. Each list of intervals is
     * pairwise disjoint and in sorted order.
     * <p>
     * Return the intersection of these two interval lists.
     * <p>
     * A closed interval [a, b] (with a <= b) denotes the set of real
     * numbers x with a <= x <= b.
     * <p>
     * The intersection of two closed intervals is a set of real numbers
     * that are either empty or represented as a closed interval. For
     * example, the intersection of [1, 3] and [2, 4] is [2, 3].
     *
     * @param firstList 0 <= firstList.length, secondList.length <= 1000
     *                  firstList.length + secondList.length >= 1
     * @param secondList 0 <= start_i < end_i <= 109
     *                   end_i < start_i+1
     *                   0 <= start_j < end_j <= 109
     *                   end_j < start_j+1
     */
    int[][] intervalIntersection(int[][] firstList, int[][] secondList);
}
