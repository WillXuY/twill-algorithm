package org.willxu.algorithm.service.integer;

public interface FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK {
    /**
     * Given an integer k, return the minimum number of Fibonacci
     * numbers whose sum is equal to k. The same Fibonacci number can be
     * used multiple times.
     * <p>
     * The Fibonacci numbers are defined as:
     * <p>
     * - F1 = 1
     * - F2 = 1
     * - Fn = Fn-1 + Fn-2 for n > 2.
     * <p>
     * It is guaranteed that for the given constraints we can always
     * find such Fibonacci numbers that sum up to k.
     *
     * @param k 1 <= k <= 10^9
     */
    int findMinFibonacciNumbers(int k);
}
