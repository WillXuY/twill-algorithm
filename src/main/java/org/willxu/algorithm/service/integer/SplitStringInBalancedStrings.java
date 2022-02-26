package org.willxu.algorithm.service.integer;

public interface SplitStringInBalancedStrings {
    /**
     * Balanced strings are those that have an equal quantity of 'L' and
     * 'R' characters.
     * Given a balanced string s, split it in the maximum amount of
     * balanced strings.
     * Return the maximum amount of split balanced strings.
     *
     * @param s 1 <= s.length <= 1000
     *          s[i] is either 'L' or 'R'.
     *          s is a balanced string.
     * @return maximum amount of balanced strings of s.
     */
    int balancedStringSplit(String s);
}
