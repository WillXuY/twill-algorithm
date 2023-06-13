package org.willxu.algorithm.service.integer;

public interface PerfectSquares {
    /**
     * Given an integer n, return the least number of perfect square
     * numbers that sum to n.
     * <p>
     * A perfect square is an integer that is the square of an integer;
     * in other words, it is the product of some integer with itself.
     * For example, 1, 4, 9, and 16 are perfect squares while 3 and 11
     * are not.
     *
     * @param n 1 <= n <= 10^4
     */
    int numSquares(int n);
}
