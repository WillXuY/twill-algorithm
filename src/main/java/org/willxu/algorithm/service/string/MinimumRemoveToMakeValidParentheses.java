package org.willxu.algorithm.service.string;

public interface MinimumRemoveToMakeValidParentheses {
    /**
     * Given a string s of '(' , ')' and lowercase English characters.
     * <p>
     * Your task is to remove the minimum number of parentheses ( '(' or
     * ')', in any positions ) so that the resulting parentheses string
     * is valid and return any valid string.
     * <p>
     * Formally, a parentheses string is valid if and only if:
     * <p>
     * - It is the empty string, contains only lowercase characters, or
     * - It can be written as AB (A concatenated with B), where A and B
     *   are valid strings, or
     * - It can be written as (A), where A is a valid string.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either '(' , ')', or lowercase English letter.
     */
    String minRemoveToMakeValid(String s);
}
