package leetcode.p1000_1099.p1047_remove_all_adjacent_duplicates_in_string;

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
