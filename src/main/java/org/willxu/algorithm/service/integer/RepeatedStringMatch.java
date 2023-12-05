package org.willxu.algorithm.service.integer;

public interface RepeatedStringMatch {
    /**
     * Given two strings a and b, return the minimum number of times you
     * should repeat string a so that string b is a substring of it. If
     * it is impossible for b to be a substring of a after repeating it,
     * return -1.
     * <p>
     * Notice: string "abc" repeated 0 times is "", repeated 1 time is
     * "abc" and repeated 2 times is "abcabc".
     *
     * @param a,b 1 <= a.length, b.length <= 10^4
     *            consist of lowercase English letters.
     */
    int repeatedStringMatch(String a, String b);
}
