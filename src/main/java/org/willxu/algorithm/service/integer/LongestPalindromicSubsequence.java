package org.willxu.algorithm.service.integer;

public interface LongestPalindromicSubsequence {
    /**
     * Given a string s, find the longest palindromic subsequence's
     * length in s.
     * <p>
     * A subsequence is a sequence that can be derived from another
     * sequence by deleting some or no elements without changing the
     * order of the remaining elements.
     *
     * @param s 1 <= s.length <= 1000
     *          s consists only of lowercase English letters.
     */
    int longestPalindromeSubseq(String s);
}
