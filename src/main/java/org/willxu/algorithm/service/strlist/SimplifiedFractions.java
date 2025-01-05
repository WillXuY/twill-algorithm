package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface SimplifiedFractions {
    /**
     * Given an integer n, return a list of all simplified fractions
     * between 0 and 1 (exclusive) such that the denominator is
     * less-than-or-equal-to n. You can return the answer in any order.
     *
     * @param n 1 <= n <= 100
     */
    List<String> simplifiedFractions(int n);
}
