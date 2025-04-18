package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfStepsToReduceNumberInBinaryRepresentationToOne;

public class NumberOfStepsToReduceNumberInBinaryRepresentationToOneLoop
        implements NumberOfStepsToReduceNumberInBinaryRepresentationToOne {
    @Override
    public int numSteps(String s) {
        int count = 0;
        int add = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            int sum = chars[i] - '0' + add;
            if (sum == 0) {
                count++;
                add = 0;
            } else if (sum == 1) {
                count += 2;
                add = 1;
            } else if (sum == 2) {
                count += 1;
                add = 1;
            }
        }
        if (add == 1) {
            count++;
        }
        return count;
    }
}
