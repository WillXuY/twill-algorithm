package org.willxu.algorithm.service.integer;

public interface UglyNimberIii {
    /**
     * An ugly number is a positive integer that is divisible by a, b,
     * or c.
     * <p>
     * Given four integers n, a, b, and c, return the n^th ugly number.
     *
     * @param n,a,b,c 1 <= n, a, b, c <= 10^9
     *                1 <= a * b * c <= 10^18
     *                It is guaranteed that the result will be in range
     *                [1, 2 * 10^9].
     */
    int nthUglyNumber(int n, int a, int b, int c);
}
