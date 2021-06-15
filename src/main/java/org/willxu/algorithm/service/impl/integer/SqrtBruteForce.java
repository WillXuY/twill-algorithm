package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.Sqrt;

public class SqrtBruteForce implements Sqrt {

    @Override
    public int mySqrt(int x) {
        final int maxSqrtRootOfInt = 46340;
        int half = x / 2 + 1;
        int min = 0;
        int max = Math.min(half, maxSqrtRootOfInt);
        half = max / 2;
        while (max != min) {
            int test = half * half;
            if (test < x) {
                min = half;
            } else if (test > x) {
                max = half;
            } else {
                return half;
            }
            if (max - min == 1) {
                /*
                accept min as result cause wrong answer 1, 2
                (max * max == x) cause wrong answer 3.
                 */
                if (max * max <= x) {
                    return max;
                }
                return min;
            }
            half = min + (max - min) / 2;
        }
        return half;
    }
}
