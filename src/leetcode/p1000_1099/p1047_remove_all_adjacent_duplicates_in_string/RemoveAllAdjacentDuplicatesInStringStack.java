package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.RemoveAllAdjacentDuplicatesInString;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringStack
        implements RemoveAllAdjacentDuplicatesInString {
    @Override
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        char[] chars = new char[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
