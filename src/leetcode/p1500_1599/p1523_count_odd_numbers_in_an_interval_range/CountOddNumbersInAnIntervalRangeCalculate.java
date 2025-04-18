package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountOddNumbersInAnIntervalRange;

public class CountOddNumbersInAnIntervalRangeCalculate
        implements CountOddNumbersInAnIntervalRange {
    @Override
    public int countOdds(int low, int high) {
        int output = 0;
        if ((low & 1) == 1) {
            output++;
            low++;
        }
        if ((high & 1) == 1) {
            output++;
            high--;
        }
        output += (high - low) / 2;
        return output;
    }
}
