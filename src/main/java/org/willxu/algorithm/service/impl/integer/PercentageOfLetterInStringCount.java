package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.PercentageOfLetterInString;

public class PercentageOfLetterInStringCount
        implements PercentageOfLetterInString {
    @Override
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c: s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count * 100 / s.length();
    }
}
