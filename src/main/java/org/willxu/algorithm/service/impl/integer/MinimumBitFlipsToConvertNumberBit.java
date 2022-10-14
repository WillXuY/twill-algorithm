package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumBitFlipsToConvertNumber;

public class MinimumBitFlipsToConvertNumberBit
        implements MinimumBitFlipsToConvertNumber {
    @Override
    public int minBitFlips(int start, int goal) {
        int output = 0;
        while (start > 0 || goal > 0) {
            output += (start % 2) ^ (goal % 2);
            start /= 2;
            goal /= 2;
        }
        return output;
    }
}
