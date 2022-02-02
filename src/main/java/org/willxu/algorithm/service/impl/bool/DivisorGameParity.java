package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.DivisorGame;

public class DivisorGameParity implements DivisorGame {
    /**
     * n  A
     * 1  L
     * 2  W  2 -> 1
     * 3  L  3 -> 2 -> 1
     * 4  W  4 -> 3
     * 5  L  5 -> 4
     * 6  W  6 -> 5
     * 7  L  7 -> 6
     * 8  W  8 -> 7
     * 9  L  9 -> 8/6
     * 10 W  10 -> 9
     * 11 L  11 -> 10
     * 12 W  12 -> 11
     * 13 L  13 -> 12
     * 14 W  14 -> 13
     * 15 L  15 -> 14/12/10
     * 16 W
     *
     * @param n 1 <= n <= 1000
     * @return parity.
     */
    @Override
    public boolean divisorGame(int n) {
        return (n & 1) == 0;
    }
}
