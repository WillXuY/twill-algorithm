package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountIntegersWithEvenDigitSum;

public class CountIntegersWithEvenDigitSumCount implements CountIntegersWithEvenDigitSum {
    @Override
    public int countEven(int num) {
        int output = 0;
        for (int i = 2; i <= num; i++) {
            if ((getDigitSum(i) & 1) == 0) {
                output++;
            }
        }
        return output;
    }

    private int getDigitSum(int num) {
        int output = 0;
        while (num > 0) {
            output += num % 10;
            num /= 10;
        }
        return output;
    }
}
