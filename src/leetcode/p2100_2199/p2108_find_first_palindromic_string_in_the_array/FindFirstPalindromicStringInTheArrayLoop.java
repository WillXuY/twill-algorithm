package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.FindFirstPalindromicStringInTheArray;

public class FindFirstPalindromicStringInTheArrayLoop
        implements FindFirstPalindromicStringInTheArray {
    @Override
    public String firstPalindrome(String[] words) {
        for (String w: words) {
            if (isPalindromic(w)) {
                return w;
            }
        }
        return "";
    }

    private boolean isPalindromic(String word) {
        char[] chars = word.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
