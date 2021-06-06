package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ValidParentheses;

import java.util.Stack;

public class ValidParenthesesBruteForce implements ValidParentheses {
    @Override
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ('(' == c || '[' == c || '{' == c) {
                stack.push(c);
            } else if (')' == c) {
                if (stack.empty()) {
                    return false;
                }
                if ('(' != stack.pop()) {
                    return false;
                }
            } else if (']' == c) {
                if (stack.empty()) {
                    return false;
                }
                if ('[' != stack.pop()) {
                    return false;
                }
            } else if ('}' == c) {
                if (stack.empty()) {
                    return false;
                }
                if ('{' != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
