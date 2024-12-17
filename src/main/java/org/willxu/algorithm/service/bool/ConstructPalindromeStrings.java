package org.willxu.algorithm.service.bool;

public interface ConstructPalindromeStrings {
    /**
     * Given a string s and an integer k, return true if you can use all
     * the characters in s to construct k palindrome strings or false
     * otherwise.
     *
     * @param s 1 <= s.length <= 10^5
     *          s consists of lowercase English letters.
     * @param k 1 <= k <= 10^5
     */
    boolean canConstruct(String s, int k);
}
