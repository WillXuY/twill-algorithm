package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.Maximum69Number;

public class Maximum69NumberDivide implements Maximum69Number {
    @Override
    public int maximum69Number(int num) {
        int multiple = 1;
        int maxMultiple = 0;
        int n = num;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder == 6) {
                maxMultiple = multiple;
            }
            multiple *= 10;
            n /= 10;
        }
        return num + 3 * maxMultiple;
    }
}
