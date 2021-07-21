package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOf1Bits;

public class NumberOf1BitsMoveRight implements NumberOf1Bits {
    @Override
    public int hammingWeight(int n) {
        int hammingWeight = 0;
        while (n != 0) {
            hammingWeight += n & 1;
            n >>>= 1;
        }
        return hammingWeight;
    }
}
