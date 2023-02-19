package org.willxu.algorithm.service.impl.doublepoint;

import org.willxu.algorithm.service.doublepoint.PowXn;

public class PowXnLoop implements PowXn {
    @Override
    public double myPow(double x, int n) {
        if (x == -1.0) {
            return (n & 1) == 1 ? -1 : 1;
        } else if (x == 1.0) {
            return 1.0;
        } else if (n <= -1000) {
            return 0.0;
        }
        int abs = Math.abs(n);
        double result = 1;
        if (n < 0) {
            for (int i = 0; i < abs; i++) {
                result /= x;
            }
        } else if (n > 0) {
            for (int i = 0; i < abs; i++) {
                result *= x;
            }
        }
        return result;
    }
}
