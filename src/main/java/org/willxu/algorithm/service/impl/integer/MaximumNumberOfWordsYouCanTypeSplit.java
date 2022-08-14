package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumNumberOfWordsYouCanType;

public class MaximumNumberOfWordsYouCanTypeSplit
        implements MaximumNumberOfWordsYouCanType {
    @Override
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int output = 0;
        for (String word: words) {
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (brokenLetters.contains(String.valueOf(chars[i]))) {
                    break;
                }
                if (i == chars.length - 1) {
                    output++;
                }
            }
        }
        return output;
    }
}
