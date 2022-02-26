package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SplitStringInBalancedStrings;

import java.util.Stack;

public class SplitStringInBalancedStringsStack
        implements SplitStringInBalancedStrings {
    @Override
    public int balancedStringSplit(String s) {
        int output = 0;
        Stack<Character> remainder = new Stack<>();
        for (char c: s.toCharArray()) {
            if (remainder.isEmpty() || c == remainder.peek()) {
                remainder.push(c);
            } else {
                remainder.pop();
                if (remainder.isEmpty()) {
                    output++;
                }
            }
        }
        return output;
    }
}
