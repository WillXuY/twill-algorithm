package org.willxu.algorithm.service.integer;

public interface SuperUglyNumber {
    /**
     * A super ugly number is a positive integer whose prime factors are
     * in the array primes.
     * <p>
     * Given an integer n and an array of integers primes, return the
     * n^th super ugly number.
     * <p>
     * The n^th super ugly number is guaranteed to fit in a 32-bit
     * signed integer.
     *
     * @param n 1 <= n <= 10^5
     * @param primes 1 <= primes.length <= 100
     *               2 <= primes[i] <= 1000
     *               primes[i] is guaranteed to be a prime number.
     *               All the values of primes are unique and sorted in
     *               ascending order.
     */
    int nthSuperUglyNumber(int n, int[] primes);
}
