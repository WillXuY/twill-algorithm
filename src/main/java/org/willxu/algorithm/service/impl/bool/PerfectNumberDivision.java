package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.PerfectNumber;

public class PerfectNumberDivision implements PerfectNumber {
    @Override
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum +=i;
            }
            if (sum > num) {
                return false;
            }
        }
        return sum == num;
    }
}
