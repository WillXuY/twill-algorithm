package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindGreatestCommonDivisorOfArray;

public class FindGreatestCommonDivisorOfArrayLoop
        implements FindGreatestCommonDivisorOfArray {
    @Override
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        for (int i = min; i > 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
