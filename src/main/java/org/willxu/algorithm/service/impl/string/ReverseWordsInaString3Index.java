package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ReverseWordsInaString3;

public class ReverseWordsInaString3Index implements ReverseWordsInaString3 {
    @Override
    public String reverseWords(String s) {
        int startIndex = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                // exchange start -> i - 1
                int half = (i - startIndex) / 2;
                for (int j = 0; j < half; j++) {
                    int source = startIndex + j;
                    int target = i - 1 - j;
                    char c = chars[source];
                    chars[source] = chars[target];
                    chars[target] = c;
                }
                startIndex = i + 1;
            } else if (i == chars.length - 1) {
                int half = (i + 1 - startIndex) / 2;
                for (int j = 0; j < half; j++) {
                    int source = startIndex + j;
                    int t = i - j;
                    char c = chars[source];
                    chars[source] = chars[t];
                    chars[t] = c;
                }
            }
        }
        return new String(chars);
    }
}
