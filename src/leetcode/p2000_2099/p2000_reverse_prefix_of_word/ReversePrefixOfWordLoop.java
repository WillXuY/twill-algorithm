package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ReversePrefixOfWord;

public class ReversePrefixOfWordLoop implements ReversePrefixOfWord {
    @Override
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int index = 0;
        while (index < chars.length) {
            if (chars[index] == ch) {
                break;
            }
            index++;
        }
        if (index == chars.length) {
            return word;
        }
        index++;
        StringBuilder output = new StringBuilder(word.substring(0, index));
        output.reverse().append(word.substring(index));
        return output.toString();
    }
}
