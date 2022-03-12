package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.ConvertIntegerToTheSumOfTwoNoZeroIntegers;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersDivide2
        implements ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    @Override
    public int[] getNoZeroIntegers(int n) {
        int number = n;
        int first = 0;
        int multiple = 1;
        while (number > 0) {
            int remainder = number % 10;
            if (remainder > 1) {
                first += remainder / 2 * multiple;
                number /= 10;
            } else if (number < 10) {
                number = 0;
            } else {
                remainder += 10;
                first += remainder / 2 * multiple;
                number /= 10;
                number--;
            }
            multiple *= 10;
        }
        return new int[] {first, n - first};
    }
}
