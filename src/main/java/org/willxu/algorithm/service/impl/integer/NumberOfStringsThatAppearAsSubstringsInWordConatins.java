package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfStringsThatAppearAsSubstringsInWord;

public class NumberOfStringsThatAppearAsSubstringsInWordConatins
        implements NumberOfStringsThatAppearAsSubstringsInWord {
    @Override
    public int numOfStrings(String[] patterns, String word) {
        int output = 0;
        for (String p: patterns) {
            if (word.contains(p)) {
                output++;
            }
        }
        return output;
    }
}
