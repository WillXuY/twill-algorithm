package org.willxu.algorithm.service.integer;

public interface PercentageOfLetterInString {
    /**
     * Given a string s and a character letter, return the percentage of
     * characters in s that equal letter rounded down to the nearest
     * whole percent.
     *
     * @param s 1 <= s.length <= 100
     *          consists of lowercase English letters.
     * @param letter is a lowercase English letter.
     */
    int percentageLetter(String s, char letter);
}
