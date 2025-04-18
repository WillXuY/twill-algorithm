package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.BreakPalindrome;

public class BreakPalindromeLoop implements BreakPalindrome {
    @Override
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if (len < 2) {
            return "";
        }
        int minIndex = 0;
        char[] chars = palindrome.toCharArray();
        for (int i = 1; i < len / 2; i++) {
            if (chars[minIndex] == 'a' && chars[i] != 'a') {
                minIndex = i;
            }
        }
        char min = chars[minIndex];
        if (min == 'a') {
            chars[chars.length - 1 - minIndex] = 'b';
        } else {
            chars[minIndex] = 'a';
        }
        return new String(chars);
    }
}
