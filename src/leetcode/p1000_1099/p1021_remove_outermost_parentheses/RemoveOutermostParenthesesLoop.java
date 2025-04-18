package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.RemoveOutermostParentheses;

public class RemoveOutermostParenthesesLoop
        implements RemoveOutermostParentheses {
    /**
     * 1. Count the number of '(' - number of ')'.
     * 2. If count = 1 or 0, remove char.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either '(' or ')'.
     *          s is a valid parentheses string.
     * @return char's string.
     */
    @Override
    public String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        int outputLength = s.length();
        int countLeftThanRight = 0;
        for (int i = 0; i < outputLength; i++) {
            if (chars[i] == '(') {
                countLeftThanRight++;
            } else if (chars[i] == ')') {
                countLeftThanRight--;
            }
            if (countLeftThanRight == 0
                    || (countLeftThanRight == 1 && chars[i] == '(')) {
                System.arraycopy(chars, i + 1, chars, i,
                        outputLength - i - 1);
                outputLength--;
                i--;
            }
        }
        char[] output = new char[outputLength];
        System.arraycopy(chars, 0, output, 0, outputLength);
        return new String(output);
    }
}
