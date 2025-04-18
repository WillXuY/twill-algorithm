package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SumOfDigitsOfStringAfterConvert;

public class SumOfDigitsOfStringAfterConvertLoop
        implements SumOfDigitsOfStringAfterConvert {
    @Override
    public int getLucky(String s, int k) {
        int output = 0;
        for (char c: s.toCharArray()) {
            int i = c - 96;
            while (i > 0) {
                output += i % 10;
                i /= 10;
            }
        }
        for (int i = 1; i < k; i++) {
            int old = output;
            output = 0;
            while (old > 0) {
                output += old % 10;
                old /= 10;
            }
        }
        return output;
    }
}
