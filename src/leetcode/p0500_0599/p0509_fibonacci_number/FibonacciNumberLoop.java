package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FibonacciNumber;

public class FibonacciNumberLoop implements FibonacciNumber {
    @Override
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int n_2 = 0;
        int n_1 = 1;
        for (int i = 2; i <= n; i++) {
            int s = n_2 + n_1;
            n_2 = n_1;
            n_1 = s;
        }
        return n_1;
    }
}
