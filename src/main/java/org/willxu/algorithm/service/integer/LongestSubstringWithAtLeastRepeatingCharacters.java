package org.willxu.algorithm.service.integer;

public interface LongestSubstringWithAtLeastRepeatingCharacters {
    /**
     * Given a string s and an integer k, return the length of the
     * longest substring of s such that the frequency of each character
     * in this substring is greater than or equal to k.
     * <p>
     * if no such substring exists, return 0.
     *
     * @param s 1 <= s.length <= 10^4
     *          consists of only lowercase English letters.
     * @param k 1 <= k <= 10^5
     */
    int longestSubstring(String s, int k);
}
