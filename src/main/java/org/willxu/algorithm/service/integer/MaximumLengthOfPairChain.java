package org.willxu.algorithm.service.integer;

public interface MaximumLengthOfPairChain {
    /**
     * You are given an array of n pairs pairs where
     * pairs[i] = [left_i, right_i] and left_i < right_i.
     * <p>
     * A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain
     * of pairs can be formed in this fashion.
     * <p>
     * Return the length longest chain which can be formed.
     * <p>
     * You do not need to use up all the given intervals. You can select
     * pairs in any order.
     *
     * @param pairs n == pairs.length
     *              1 <= n <= 1000
     *              -1000 <= left_i < right_i <= 1000
     */
    int findLongestChain(int[][] pairs);
}
