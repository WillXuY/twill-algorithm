package org.willxu.algorithm.service.integer;

public interface IntegerReplacement {
    /**
     * Given a positive integer n, you can apply one of the following
     * operations:
     * <p>
     * 1. If n is even, replace n with n / 2.
     * 2. If n is odd, replace n with either n + 1 or n - 1.
     * <p>
     * Return the minimum number of operations needed for n to become 1.
     *
     * @param n 1 <= n <= 2^31 - 1
     */
    int integerReplacement(int n);
}
