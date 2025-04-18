package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfStepsToReduceNumberToZero;

public class NumberOfStepsToReduceNumberToZeroLoop
        implements NumberOfStepsToReduceNumberToZero {
    @Override
    public int numberOfSteps(int num) {
        int output = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                num--;
            } else {
                num /= 2;
            }
            output++;
        }
        return output;
    }
}
