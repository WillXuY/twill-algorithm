package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CircularSentence;

public class CircularSentenceSplit implements CircularSentence {
    @Override
    public boolean isCircularSentence(String sentence) {
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        if (firstChar != lastChar) {
            return false;
        }
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            char end = words[i].charAt(words[i].length() - 1);
            char start = words[i + 1].charAt(0);
            if (end != start) {
                return false;
            }
        }
        return true;
    }
}
