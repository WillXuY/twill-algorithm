package org.willxu.algorithm.service.bool;

public interface CheckIfOneStringSwapCanMakeStringsEqual {
    /**
     * You are given two strings s1 and s2 of equal length. A string
     * swap is an operation where you choose two indices in a string
     * (not necessarily different) and swap the characters at these
     * indices.
     *
     * Return true if it is possible to make both strings equal by
     * performing at most one string swap on exactly one of the
     * strings. Otherwise, return false.
     *
     * @param s1, s2 1 <= s1.length, s2.length <= 100
     *            s1.length == s2.length
     *            consist of only lowercase English letters.
     */
    boolean areAlmostEqual(String s1, String s2);
}
