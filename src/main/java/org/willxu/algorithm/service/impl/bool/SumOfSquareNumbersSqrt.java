package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.SumOfSquareNumbers;

public class SumOfSquareNumbersSqrt implements SumOfSquareNumbers {
    @Override
    public boolean judgeSquareSum(int c) {
        int sqrtC = (int) Math.sqrt(c);
        for (int i = 0; i <= sqrtC; i++) {
            int diff = c - i * i;
            double b = Math.sqrt(diff);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
