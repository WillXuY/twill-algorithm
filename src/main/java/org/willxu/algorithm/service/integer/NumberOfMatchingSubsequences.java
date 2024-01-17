package org.willxu.algorithm.service.integer;

public interface NumberOfMatchingSubsequences {
    /**
     * Given a string s and an array of strings words, return the number
     * of words[i] that is a subsequence of s.
     * <p>
     * A subsequence of a string is a new string generated from the
     * original string with some characters (can be none) deleted
     * without changing the relative order of the remaining characters.
     * <p>
     * For example, "ace" is a subsequence of "abcde".
     *
     * @param s 1 <= s.length <= 5 * 10^4
     *          consist of only lowercase English letters.
     * @param words 1 <= words.length <= 5000
     *              1 <= words[i].length <= 50
     *              consist of only lowercase English letters.
     */
    int numMatchingSubseq(String s, String[] words);
}
