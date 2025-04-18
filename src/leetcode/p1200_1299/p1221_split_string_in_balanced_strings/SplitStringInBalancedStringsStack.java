package leetcode.p1200_1299.p1221_split_string_in_balanced_strings;

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
