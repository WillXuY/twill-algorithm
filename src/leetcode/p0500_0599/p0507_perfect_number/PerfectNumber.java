package org.willxu.algorithm.service.bool;

public interface PerfectNumber {
    /**
     * A perfect number is a positive integer that is equal to the sum
     * of its positive divisors, excluding the number itself. A divisor
     * of an integer x is an integer that can divide x evenly.
     * Given an integer n, return true if n is a perfect number,
     * otherwise return false.
     *
     * @param num 1 <= num <= 10^8
     * @return is perfect number.
     */
    boolean checkPerfectNumber(int num);
}
