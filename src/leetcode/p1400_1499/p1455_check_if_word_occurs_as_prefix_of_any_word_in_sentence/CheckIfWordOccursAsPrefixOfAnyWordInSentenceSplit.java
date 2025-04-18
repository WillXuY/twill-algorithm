package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CheckIfWordOccursAsPrefixOfAnyWordInSentence;

public class CheckIfWordOccursAsPrefixOfAnyWordInSentenceSplit
        implements CheckIfWordOccursAsPrefixOfAnyWordInSentence {
    @Override
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isPrefix(searchWord, words[i])) {
                return i + 1;
            }
        }
        return -1;
    }

    private boolean isPrefix(String searchWord, String word) {
        char[] searchChars = searchWord.toCharArray();
        char[] wordChars = word.toCharArray();
        if (searchChars.length > wordChars.length) {
            return false;
        }
        for (int i = 0; i < searchChars.length; i++) {
            if (wordChars[i] != searchChars[i]) {
                return false;
            }
        }
        return true;
    }
}
