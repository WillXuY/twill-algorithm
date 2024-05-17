package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PowerfulIntegers {
    /**
     * Given three integers x, y, and bound, return a list of all the
     * powerful integers that have a value less than or equal to bound.
     * <p>
     * An integer is powerful if it can be represented as x^i + y^j for
     * some integers i >= 0 and j >= 0.
     * <p>
     * You may return the answer in any order. In your answer, each
     * value should occur at most once.
     *
     * @param x,y 1 <= x, y <= 100
     * @param bound 0 <= bound <= 10^6
     */
    List<Integer> powerfulIntegers(int x, int y, int bound);
}
