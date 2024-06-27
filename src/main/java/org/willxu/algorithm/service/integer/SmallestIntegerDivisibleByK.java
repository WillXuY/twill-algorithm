package org.willxu.algorithm.service.integer;

public interface SmallestIntegerDivisibleByK {
    /**
     * Given a positive integer k, you need to find the length of the
     * smallest positive integer n such that n is divisible by k, and n
     * only contains the digit 1.
     * <p>
     * Return the length of n. If there is no such n, return -1.
     * <p>
     * Note: n may not fit in a 64-bit signed integer.
     *
     * @param k 1 <= k <= 10^5
     */
    int smallestRepunitDivByK(int k);
}
