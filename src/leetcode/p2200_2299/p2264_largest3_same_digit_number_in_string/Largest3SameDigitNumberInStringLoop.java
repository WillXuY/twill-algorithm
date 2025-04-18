package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.Largest3SameDigitNumberInString;

import java.util.Collections;

public class Largest3SameDigitNumberInStringLoop
        implements Largest3SameDigitNumberInString {
    @Override
    public String largestGoodInteger(String num) {
        char max = '-';
        char[] chars = num.toCharArray();
        for (int i = 0; i < num.length() - 2; i++) {
            if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2]) {
                if (max == '-') {
                    max = chars[i];
                } else if (max < chars[i]) {
                    max = chars[i];
                }
            }
        }
        if (max == '-') {
            return "";
        }
        return String.join("", Collections.nCopies(3, String.valueOf(max)));
    }
}
