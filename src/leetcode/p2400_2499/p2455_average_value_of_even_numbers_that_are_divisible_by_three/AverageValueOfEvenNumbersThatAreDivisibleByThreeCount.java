package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.AverageValueOfEvenNumbersThatAreDivisibleByThree;

public class AverageValueOfEvenNumbersThatAreDivisibleByThreeCount
        implements AverageValueOfEvenNumbersThatAreDivisibleByThree {
    @Override
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int n: nums) {
            if (n % 3 == 0 && (n & 1) == 0) {
                sum += n;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }
}
