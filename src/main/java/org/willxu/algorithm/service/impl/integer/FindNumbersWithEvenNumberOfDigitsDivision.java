package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindNumbersWithEvenNumberOfDigits;

public class FindNumbersWithEvenNumberOfDigitsDivision
        implements FindNumbersWithEvenNumberOfDigits {
    @Override
    public int findNumbers(int[] nums) {
        int output = 0;
        for (int n: nums) {
            if ((getNumberOfBits(n) & 1) == 0) {
                output++;
            }
        }
        return output;
    }

    private int getNumberOfBits(int num) {
        int output = 0;
        while (num > 0) {
            output++;
            num /= 10;
        }
        return output;
    }
}
