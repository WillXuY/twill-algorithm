package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SmallestRange1;

public class SmallestRange1Find implements SmallestRange1 {
    @Override
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i: nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int diff = max - min - 2 * k;
        return Math.max(diff, 0);
    }
}
