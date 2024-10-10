package org.willxu.algorithm.service.integer;

public interface ReplaceTheSubstringForBalancedString {
    /**
     * You are given a string s of length n containing only four kinds
     * of characters: 'Q', 'W', 'E', and 'R'.
     * <p>
     * A string is said to be balanced if each of its characters appears
     * n / 4 times where n is the length of the string.
     * <p>
     * Return the minimum length of the substring that can be replaced
     * with any other string of the same length to make s balanced. If s
     * is already balanced, return 0.
     *
     * @param s n == s.length
     *          4 <= n <= 10^5
     *          n is a multiple of 4.
     *          contains only 'Q', 'W', 'E', and 'R'.
     */
    int balancedString(String s);
}
