package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.LargestOddNumberInString;

public class LargestOddNumberInStringIndex implements LargestOddNumberInString {
    @Override
    public String largestOddNumber(String num) {
        char[] chars = num.toCharArray();
        int index = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if ((chars[i] & 1) == 1) {
                index = i;
                break;
            }
        }
        return num.substring(0, index + 1);
    }
}
