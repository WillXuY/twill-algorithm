package leetcode.p1500_1599.p1544_make_the_string_great;

import java.util.Stack;

public class MakeTheStringGreatStack implements MakeTheStringGreat {
    @Override
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: chars) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                Character last = stack.peek();
                if (isLowerAndUpperCaseEnglishLetters(last, c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        char[] output = new char[stack.size()];
        for (int i = output.length - 1; i >= 0; i--) {
            output[i] = stack.pop();
        }
        return new String(output);
    }

    private boolean isLowerAndUpperCaseEnglishLetters(char a, char b) {
        int difference = 32;
        if (a >= 'a' && a <= 'z') {
            return b + difference == a;
        } else if (a >= 'A' && a <= 'Z') {
            return a + difference == b;
        }
        return false;
    }
}
