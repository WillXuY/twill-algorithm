package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ReverseWordsInString;

public class ReverseWordsInStringSplit implements ReverseWordsInString {
    @Override
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
