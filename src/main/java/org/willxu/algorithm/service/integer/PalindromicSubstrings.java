package org.willxu.algorithm.service.integer;

public interface PalindromicSubstrings {
    /**
     * Given a string s, return the number of palindromic substrings in
     * it.
     * <p>
     * A string is a palindrome when it reads the same backward as
     * forward.
     * <p>
     * A substring is a contiguous sequence of characters within the
     * string.
     *
     * @param s 1 <= s.length <= 1000
     *          consists of lowercase English letters.
     */
    int countSubstrings(String s);
}
