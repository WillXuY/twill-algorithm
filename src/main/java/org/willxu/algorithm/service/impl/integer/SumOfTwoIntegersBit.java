package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SumOfTwoIntegers;

public class SumOfTwoIntegersBit implements SumOfTwoIntegers {
    @Override
    public int getSum(int a, int b) {
        int xor = a ^ b;
        int and = a & b;
        while (and != 0) {
            a = xor;
            b = and << 1;
            xor = a ^ b;
            and = a & b;
        }
        return xor;
    }
}
