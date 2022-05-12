package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ThousandSeparator;

public class ThousandSeparatorCharacter implements ThousandSeparator {
    @Override
    public String thousandSeparator(int n) {
        String numberString = String.valueOf(n);
        if (n < 1000) {
            return numberString;
        }
        char[] chars = numberString.toCharArray();
        int remainder = chars.length % 3;
        int addLength = chars.length / 3;
        if (remainder == 0) {
            addLength--;
        }
        char[] output = new char[chars.length + addLength];
        output[0] = chars[0];
        int countPointAdded = 0;
        for (int i = 1; i < chars.length; i++) {
            if (remainder == i % 3) {
                output[i + countPointAdded] = '.';
                countPointAdded++;
            }
            output[i + countPointAdded] = chars[i];
        }
        return new String(output);
    }
}
