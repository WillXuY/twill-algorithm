package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumTimeToTypeWordUsingSpecialTypewriter;

public class MinimumTimeToTypeWordUsingSpecialTypewriterSubtraction
        implements MinimumTimeToTypeWordUsingSpecialTypewriter {
    @Override
    public int minTimeToType(String word) {
        char last = 'a';
        int output = 0;
        for (char c: word.toCharArray()) {
            int difference = Math.abs(c - last);
            output += Math.min(difference, 26 - difference);
            last = c;
        }
        return output + word.length();
    }
}
