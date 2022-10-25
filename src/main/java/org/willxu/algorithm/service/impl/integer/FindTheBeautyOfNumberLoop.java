package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindTheBeautyOfNumber;

public class FindTheBeautyOfNumberLoop implements FindTheBeautyOfNumber {
    @Override
    public int divisorSubstrings(int num, int k) {
        int divider = 1;
        for (int i = 0; i < k; i++) {
            divider *= 10;
        }
        int output = 0;
        int change = num;
        while (change >= divider / 10) {
            int remainder = change % divider;
            if (remainder != 0 && num % remainder == 0) {
                output++;
            }
            change /= 10;
        }
        return output;
    }
}
