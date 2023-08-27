package org.willxu.algorithm.service.string;

public interface SortCharactersByFrequency {
    /**
     * Given a string s, sort it in decreasing order based on the
     * frequency of the characters. The frequency of a character is the
     * number of times it appears in the string.
     * <p>
     * Return the sorted string. If there are multiple answers, return
     * any of them.
     *
     * @param s 1 <= s.length <= 5 * 10^5
     *          consists of uppercase and lowercase English letters
     *          and digits.
     */
    String frequencySort(String s);
}
