package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SmallestEvenMultiple;

public class SmallestEvenMultipleAnd implements SmallestEvenMultiple {
    @Override
    public int smallestEvenMultiple(int n) {
        return (n & 1) == 0 ? n: n * 2;
    }
}
