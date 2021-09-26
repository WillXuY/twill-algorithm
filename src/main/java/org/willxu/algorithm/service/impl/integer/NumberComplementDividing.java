package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberComplement;

public class NumberComplementDividing implements NumberComplement {
    @Override
    public int findComplement(int num) {
        int result = 0;
        int add = 1;
        while (num > 0) {
            if (num % 2 != 1) {
                result += add;
            }
            add *= 2;
            num /= 2;
        }
        return result;
    }
}
