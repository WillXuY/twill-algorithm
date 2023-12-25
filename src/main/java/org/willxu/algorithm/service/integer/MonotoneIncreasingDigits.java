package org.willxu.algorithm.service.integer;

public interface MonotoneIncreasingDigits {
    /**
     * An integer has monotone increasing digits if and only if each
     * pair of adjacent digits x and y satisfy x <= y.
     * <p>
     * Given an integer n, return the largest number that is less than
     * or equal to n with monotone increasing digits.
     *
     * @param n 0 <= n <= 10^9
     */
    int monotoneIncreasingDigits(int n);
}
