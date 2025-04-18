package org.willxu.algorithm.service.bool;

public interface RepeatedSubstringPattern {
    /**
     * Given a string s, check if it can be constructed by taking a
     * substring of it and appending multiple copies of the substring
     * together.
     *
     * @param s 1 <= s.length <= 10^4
     *          consists of lowercase English letters.
     * @return is substring repeated.
     */
    boolean repeatedSubstringPattern(String s);
}
