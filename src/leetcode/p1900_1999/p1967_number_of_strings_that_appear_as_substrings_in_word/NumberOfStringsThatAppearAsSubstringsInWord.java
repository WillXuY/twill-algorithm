package org.willxu.algorithm.service.integer;

public interface NumberOfStringsThatAppearAsSubstringsInWord {
    /**
     * Given an array of strings patterns and a string word, return the
     * number of strings in patterns that exist as a substring in word.
     * <p>
     * A substring is a contiguous sequence of characters within a
     * string.
     *
     * @param patterns 1 <= patterns.length <= 100
     *                 1 <= patterns[i].length <= 100
     *                 consist of lowercase English letters.
     * @param word 1 <= word.length <= 100
     *             consist of lowercase English letters.
     */
    int numOfStrings(String[] patterns, String word);
}
