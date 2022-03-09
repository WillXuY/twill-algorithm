package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.FindUniqueIntegersSumUpToZero;

public class FindUniqueIntegersSumUpToZeroSymmetry
        implements FindUniqueIntegersSumUpToZero {
    @Override
    public int[] sumZero(int n) {
        int subtrahend = 1;
        int[] output = new int[n];
        for (int i = 0; i < n / 2; i++) {
            output[i] += subtrahend;
            output[n - 1 - i] -= subtrahend;
            subtrahend++;
        }
        return output;
    }
}
