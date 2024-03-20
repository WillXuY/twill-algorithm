package org.willxu.algorithm.service.bool;

public interface PossibleBipartition {
    /**
     * We want to split a group of n people (labeled from 1 to n) into
     * two groups of any size. Each person may dislike some other
     * people, and they should not go into the same group.
     * <p>
     * Given the integer n and the array dislikes where dislikes[i] =
     * [a_i, b_i] indicates that the person labeled a_i does not like
     * the person labeled b_i, return true if it is possible to split
     * everyone into two groups in this way.
     *
     * @param n 1 <= n <= 2000
     * @param dislikes 0 <= dislikes.length <= 10^4
     *                 dislikes[i].length == 2
     *                 1 <= a_i < b_i <= n
     *                 All the pairs of dislikes are unique.
     */
    boolean possibleBipartition(int n, int[][] dislikes);
}
