package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfNumberHasEqualDigitCountAndDigitValue;

public class CheckIfNumberHasEqualDigitCountAndDigitValueCount
        implements CheckIfNumberHasEqualDigitCountAndDigitValue {
    @Override
    public boolean digitCount(String num) {
        int[] count = new int[10];
        char[] chars = num.toCharArray();
        for (char c: chars) {
            count[c - '0']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (count[i] != chars[i] - '0') {
                return false;
            }
        }
        return true;
    }
}
