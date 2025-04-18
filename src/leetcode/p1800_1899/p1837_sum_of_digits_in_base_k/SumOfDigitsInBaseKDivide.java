package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SumOfDigitsInBaseK;

public class SumOfDigitsInBaseKDivide implements SumOfDigitsInBaseK {
    @Override
    public int sumBase(int n, int k) {
        int output = 0;
        while (n > 0) {
            output += n % k;
            n /= k;
        }
        return output;
    }
}
