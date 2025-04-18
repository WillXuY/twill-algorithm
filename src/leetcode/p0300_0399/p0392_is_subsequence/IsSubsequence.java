package leetcode.p0300_0399.p0392_is_subsequence;

public interface IsSubsequence {
    /**
     * Given two strings s and t, return true if s is a subsequence of
     * t, or false otherwise.
     * A subsequence of a string that is formed from the original string
     * by deleting some (can be none) of the characters without
     * disturbing the relative positions of the remaining characters.
     * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     *
     * @param s 0 <= s.length <= 100
     *          consist only of lowercase English letters.
     * @param t 0 <= t.length <= 10^4
     *          consist only of lowercase English letters.
     * @return s is t's subsequence.
     */
    boolean isSubsequence(String s, String t);
}
