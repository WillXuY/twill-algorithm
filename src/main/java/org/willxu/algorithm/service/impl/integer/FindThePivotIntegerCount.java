package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindThePivotInteger;

public class FindThePivotIntegerCount implements FindThePivotInteger {
    @Override
    public int pivotInteger(int n) {
        int[] sums = new int[n];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            sums[i - 1] = sum;
        }
        for (int i = 1; i <= n; i++) {
            int s = sums[i - 1];
            if (s == sums[n - 1] - s + i) {
                return i;
            }
        }
        return -1;
    }
}
