package org.willxu.algorithm.service.bool;

public interface ValidParentheses {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '['
     * and ']', determine if the input string is valid.
     * An input string is valid if:
     * 1. Open brackets must be closed by the same type of brackets.
     * 2. Open brackets must be closed in the correct order.
     * @param s - 1 <= s.length <= 10^4
     *          - s consists of parentheses only '(){}[]'.
     * @return is valid
     */
    boolean isValid(String s);
}
