package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ReverseOnlyLetters;

public class ReverseOnlyLettersIndex implements ReverseOnlyLetters {
    @Override
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            } else if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }
            char change = chars[start];
            chars[start] = chars[end];
            chars[end] = change;
            start++;
            end--;
        }
        return new String(chars);
    }
}
