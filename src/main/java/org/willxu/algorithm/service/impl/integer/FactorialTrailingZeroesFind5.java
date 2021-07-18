package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FactorialTrailingZeroes;

public class FactorialTrailingZeroesFind5 implements FactorialTrailingZeroes {
    /**
     * 2 * 5 will get zero, find 5 first.
     * 5, 10, 15, 20, 25, 30, ..., 50, ..., 75, ..., 125, ..., 625
     * every 5 numbers will get a trailing zero.
     * in these numbers every 5 numbers will get another trailing zero.
     *
     * @param n 0 <= n <= 10^4
     * @return trailing zeroes' number
     */
    @Override
    public int trailingZeroes(int n) {
        int zeroes = 0;
        while (n > 0) {
            n /= 5;
            zeroes += n;
        }
        return zeroes;
    }
}
