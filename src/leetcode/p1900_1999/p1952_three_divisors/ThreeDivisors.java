package org.willxu.algorithm.service.bool;

public interface ThreeDivisors {
    /**
     * Given an integer n, return true if n has exactly three positive
     * divisors. Otherwise, return false.
     * <p>
     * An integer m is a divisor of n if there exists an integer k such
     * that n = k * m.
     *
     * @param n 1 <= n <= 10^4
     */
    boolean isThree(int n);
}
