package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumCutsToDivideCircle;

public class MinimumCutsToDivideCircleDivide
        implements MinimumCutsToDivideCircle {
    @Override
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if ((n & 1) == 0) {
            n /= 2;
        }
        return n;
    }
}
