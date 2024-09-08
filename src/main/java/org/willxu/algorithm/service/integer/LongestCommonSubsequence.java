package org.willxu.algorithm.service.integer;

public interface LongestCommonSubsequence {
    /**
     * Given two strings text1 and text2, return the length of their
     * longest common subsequence. If there is no common subsequence,
     * return 0.
     * <p>
     * A subsequence of a string is a new string generated from the
     * original string with some characters (can be none) deleted
     * without changing the relative order of the remaining characters.
     * <p>
     * For example, "ace" is a subsequence of "abcde".
     * <p>
     * A common subsequence of two strings is a subsequence that is
     * common to both strings.
     *
     * @param text1,text2 1 <= text1.length, text2.length <= 1000
     *                    consist of only lowercase English characters.
     */
    int longestCommonSubsequence(String text1, String text2);
}
