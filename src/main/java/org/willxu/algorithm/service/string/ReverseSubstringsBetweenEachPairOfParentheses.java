package org.willxu.algorithm.service.string;

public interface ReverseSubstringsBetweenEachPairOfParentheses {
    /**
     * You are given a string s that consists of lower case English
     * letters and brackets.
     * <p>
     * Reverse the strings in each pair of matching parentheses,
     * starting from the innermost one.
     * <p>
     * Your result should not contain any brackets.
     *
     * @param s 1 <= s.length <= 2000
     *          only contains lower case English characters and parentheses.
     *          It is guaranteed that all parentheses are balanced.
     */
    String reverseParentheses(String s);
}
