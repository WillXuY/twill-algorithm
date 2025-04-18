package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumAddToMakeParenthesesValid;

public class MinimumAddToMakeParenthesesValidCount
        implements MinimumAddToMakeParenthesesValid {
    @Override
    public int minAddToMakeValid(String s) {
        int countLeft = 0;
        int countRight = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                countLeft++;
            } else if (c == ')') {
                if (countLeft > 0) {
                    countLeft--;
                } else {
                    countRight++;
                }
            }
        }
        return countLeft + countRight;
    }
}
