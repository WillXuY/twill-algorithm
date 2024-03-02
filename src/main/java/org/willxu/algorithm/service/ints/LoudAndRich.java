package org.willxu.algorithm.service.ints;

public interface LoudAndRich {
    /**
     * There is a group of n people labeled from 0 to n - 1 where each
     * person has a different amount of money and a different level of
     * quietness.
     * <p>
     * You are given an array richer where richer[i] = [a_i, b_i]
     * indicates that a_i has more money than bi and an integer array
     * quiet where quiet[i] is the quietness of the ith person. All the
     * given data in richer are logically correct (i.e., the data will
     * not lead you to a situation where x is richer than y and y is
     * richer than x at the same time).
     * <p>
     * Return an integer array answer where answer[x] = y if y is the
     * least quiet person (that is, the person y with the smallest value
     * of quiet[y]) among all people who definitely have equal to or
     * more money than the person x.
     *
     * @param richer 0 <= richer.length <= n * (n - 1) / 2
     *               0 <= a_i, b_i < n
     *               a_i != b_i
     *               All the pairs of richer are unique.
     *               The observations in richer are all logically
     *               consistent.
     * @param quiet n == quiet.length
     *              1 <= n <= 500
     *              0 <= quiet[i] < n
     *              All the values of quiet are unique.
     */
    int[] loudAndRich(int[][] richer, int[] quiet);
}
