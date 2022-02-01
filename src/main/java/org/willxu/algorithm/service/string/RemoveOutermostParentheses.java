package org.willxu.algorithm.service.string;

public interface RemoveOutermostParentheses {
    /**
     * A valid parentheses string is either empty "", "(" + A + ")", or
     * A + B, where A and B are valid parentheses strings, and +
     * represents string concatenation.
     * - For example, "", "()", "(())()", and "(()(()))" are all valid
     *   parentheses strings.
     * A valid parentheses string s is primitive if it is nonempty, and
     * there does not exist a way to split it into s = A + B, with A and
     * B nonempty valid parentheses string.
     * Given a valid parentheses string s, consider its primitive
     * decomposition: s = P_1 + P_2 + ... + P_k, where P_i are primitive
     * valid parentheses strings.
     * Return s after removing the outermost parentheses of every
     * primitive string in the primitive decomposition of s.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either '(' or ')'.
     *          s is a valid parentheses string.
     * @return remove s's outer parentheses.
     */
    String removeOuterParentheses(String s);
}
