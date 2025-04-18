package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.extend.FirstBadVersion;
import org.willxu.algorithm.service.integer.AddDigits;

public class AddDigitsLoop implements AddDigits {
    @Override
    public int addDigits(int num) {
        while (num > 9) {
            num = addDigit(num);
        }
        return num;
    }

    private int addDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
