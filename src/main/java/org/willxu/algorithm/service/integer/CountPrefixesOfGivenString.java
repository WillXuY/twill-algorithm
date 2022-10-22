package org.willxu.algorithm.service.integer;

public interface CountPrefixesOfGivenString {
    /**
     * You are given a string array words and a string s, where words[i]
     * and s comprise only of lowercase English letters.
     * <p>
     * Return the number of strings in words that are a prefix of s.
     * <p>
     * A prefix of a string is a substring that occurs at the beginning
     * of the string. A substring is a contiguous sequence of characters
     * within a string.
     *
     * @param words 1 <= words.length <= 1000
     *              1 <= words[i].length <= 10
     *              consist of lowercase English letters only.
     * @param s consist of lowercase English letters only.
     *          1 <= s.length <= 10
     */
    int countPrefixes(String[] words, String s);
}
