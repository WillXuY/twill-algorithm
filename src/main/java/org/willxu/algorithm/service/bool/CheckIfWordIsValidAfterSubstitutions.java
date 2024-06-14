package org.willxu.algorithm.service.bool;

public interface CheckIfWordIsValidAfterSubstitutions {
    /**
     * Given a string s, determine if it is valid.
     * <p>
     * A string s is valid if, starting with an empty string t = "", you
     * can transform t into s after performing the following operation
     * any number of times:
     * <p>
     * - Insert string "abc" into any position in t. More formally, t
     *   becomes t_left + "abc" + t_right, where t == t_left + t_right.
     *   Note that t_left and t_right may be empty.
     * <p>
     * Return true if s is a valid string, otherwise, return false.
     *
     * @param s 1 <= s.length <= 2 * 10^4
     *          consists of letters 'a', 'b', and 'c'
     */
    boolean isValid(String s);
}
