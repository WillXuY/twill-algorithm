package org.willxu.algorithm.service.integer;

public interface LongestPalindrome {
    /**
     * Given a string s which consists of lowercase or uppercase
     * letters, return the length of the longest palindrome that can be
     * built with those letter.
     * Letters are case sensitive, for example, "Aa" is not considered
     * a palindrome here.
     *
     * @param s 1 <= s.length <= 2000
     *          s consists of lowercase and/or uppercase English letters
     *          only.
     * @return the length of longest palindrome.
     */
    int longestPalindrome(String s);
}
