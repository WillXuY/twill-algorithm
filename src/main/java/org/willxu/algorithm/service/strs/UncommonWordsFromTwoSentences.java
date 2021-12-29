package org.willxu.algorithm.service.strs;

public interface UncommonWordsFromTwoSentences {
    /**
     * A sentence is a string of single-space separated words where
     * each word consists only of lowercase letters.
     * A word is uncommon if it appears exactly once in one of the
     * sentences, and does not appear in the other sentence.
     * Given two sentences s1 and s2, return a list of all the uncommon
     * words. You may return the answer in any order.
     *
     * @param s1 1 <= s1.length <= 200
     *           consist of lowercase English letters and spaces.
     *           do not have leading or trailing spaces.
     *           All the words in s1 are separated by a single space.
     * @param s2 1 <= s2.length <= 200
     *           consist of lowercase English letters and spaces.
     *           do not have leading or trailing spaces.
     *           All the words in s2 are separated by a single space.
     * @return list of words which appears exactly once in one of the
     *         sentences, and does not appear in the other sentence.
     */
    String[] uncommonFromSentences(String s1, String s2);
}
