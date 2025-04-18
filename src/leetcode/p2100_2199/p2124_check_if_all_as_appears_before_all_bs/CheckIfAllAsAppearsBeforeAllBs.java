package org.willxu.algorithm.service.bool;

public interface CheckIfAllAsAppearsBeforeAllBs {
    /**
     * Given a string s consisting of only the characters 'a' and 'b',
     * return true if every 'a' appears before every 'b' in the string.
     * Otherwise, return false.
     *
     * @param s 1 <= s.length <= 100
     *          s[i] is either 'a' or 'b'.
     */
    boolean checkString(String s);
}
