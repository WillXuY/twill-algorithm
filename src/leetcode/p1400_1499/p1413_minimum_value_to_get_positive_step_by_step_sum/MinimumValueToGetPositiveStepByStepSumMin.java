package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumValueToGetPositiveStepByStepSum;

public class MinimumValueToGetPositiveStepByStepSumMin
        implements MinimumValueToGetPositiveStepByStepSum {
    @Override
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int n: nums) {
            count += n;
            min = Math.min(min, count);
        }
        return Math.max(1, 1 - min);
    }
}
