package com.willxu.algorithm.service.integer2integer;

public interface NthTribonacciNumberService {
    /**
     * https://leetcode.com/problems/n-th-tribonacci-number/
     * 1137. N-th Tribonacci Number
     *
     * The Tribonacci sequence T_n is defined as follows:
     * T_0 = 0, T_1 = 1, T_2 = 1, and T_(n+3) = T_n + T_(n+1) + T_(n+2) for n>= 0.
     * Given n, return the value of T_n.
     * Constraints:
     * 1. 0 <= n <= 37
     * 2. The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
     * @param n nth
     */
    int getNthTribonacciNumber(int n);
}
