package org.willxu.algorithm.service.string;

public interface LongestNiceSubstring {
    /**
     * A string s is nice if, for every letter of the alphabet that s
     * contains, it appears both in uppercase and lowercase. For
     * example, "abABB" is nice because 'A' and 'a' appear, and 'B' and
     * 'b' appear. However, "abA" is not because 'b' appears, but 'B'
     * does not.
     *
     * Given a string s, return the longest substring of s that is nice.
     * If there are multiple, return the substring of the earliest
     * occurrence. If there are none, return an empty string.
     *
     * @param s 1 <= s.length <= 100
     *          consists of uppercase and lowercase English letters.
     */
    String longestNiceSubstring(String s);
}
