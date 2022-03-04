package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SubtractTheProductAndSumOfDigitsOfAnInteger;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerDivision
        implements SubtractTheProductAndSumOfDigitsOfAnInteger {
    @Override
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder;
            product *= remainder;
            n /= 10;
        }
        return product - sum;
    }
}
