package org.willxu.algorithm.service.impl.int2int;

import org.willxu.algorithm.service.int2int.NthTribonacciNumberService;

public class NthTribonacciNumberRecursiveImpl implements NthTribonacciNumberService {
    /**
     * try the recursive
     * 用时过久： 6s
     * 1. 调整 if 顺序与组合 5s
     * 用时还是过久
     * @param n the input number n
     * @return the N-th Tribonacci Number
     */
    @Override
    public int getNthTribonacciNumber(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        return getNthTribonacciNumber(n - 1) + getNthTribonacciNumber(n - 2) + getNthTribonacciNumber(n - 3);
    }
}
