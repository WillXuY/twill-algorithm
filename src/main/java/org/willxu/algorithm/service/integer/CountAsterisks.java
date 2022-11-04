package org.willxu.algorithm.service.integer;

public interface CountAsterisks {
    /**
     * You are given a string s, where every two consecutive vertical
     * bars '|' are grouped into a pair. In other words, the 1st and 2nd
     * '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
     * <p>
     * Return the number of '*' in s, excluding the '*' between each
     * pair of '|'.
     * <p>
     * Note that each '|' will belong to exactly one pair.
     *
     * @param s 1 <= s.length <= 1000
     *          consists of lowercase English letters, vertical bars
     *          '|', and asterisks '*'.
     *          contains an even number of vertical bars '|'.
     */
    int countAsterisks(String s);
}
