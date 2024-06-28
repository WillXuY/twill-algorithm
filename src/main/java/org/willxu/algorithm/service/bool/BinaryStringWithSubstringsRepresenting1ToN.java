package org.willxu.algorithm.service.bool;

public interface BinaryStringWithSubstringsRepresenting1ToN {
    /**
     * Given a binary string s and a positive integer n, return true if
     * the binary representation of all the integers in the range [1, n]
     * are substrings of s, or false otherwise.
     * <p>
     * A substring is a contiguous sequence of characters within a
     * string.
     *
     * @param s 1 <= s.length <= 1000
     *          s[i] is either '0' or '1'.
     * @param n 1 <= n <= 10^9
     */
    boolean queryString(String s, int n);
}
