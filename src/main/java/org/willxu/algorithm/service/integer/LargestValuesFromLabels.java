package org.willxu.algorithm.service.integer;

public interface LargestValuesFromLabels {
    /**
     * You are given n item's value and label as two integer arrays
     * values and labels. You are also given two integers numWanted and
     * useLimit.
     * <p>
     * Your task is to find a subset of items with the maximum sum of
     * their values such that:
     * <p>
     * - The number of items is at most numWanted.
     * - The number of items with the same label is at most useLimit.
     * <p>
     * Return the maximum sum.
     *
     * @param values,labels n == values.length == labels.length
     *                      1 <= n <= 2 * 10^4
     *                      0 <= values[i], labels[i] <= 2 * 10^4
     * @param numWanted,useLimit 1 <= numWanted, useLimit <= n
     */
    int largestValsFromLabels(int[] values, int[] labels, int numWanted,
                              int useLimit);
}
