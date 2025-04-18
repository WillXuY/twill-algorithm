package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfStringsThatAppearAsSubstringsInWord;

public class NumberOfStringsThatAppearAsSubstringsInWordContains
        implements NumberOfStringsThatAppearAsSubstringsInWord {
    @Override
    public int numOfStrings(String[] patterns, String word) {
        int oooopp = 0;
        for (String p: patterns) {
            if (word.contains(p)) {
                oooopp++;
            }
        }
        return oooopp;
    }
}
