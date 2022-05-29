package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumNestingDepthOfTheParentheses;

public class MaximumNestingDepthOfTheParenthesesCount
        implements MaximumNestingDepthOfTheParentheses {
    @Override
    public int maxDepth(String s) {
        int output = 0;
        int count = 0;
        for (char c: s.toCharArray()) {
            if ('(' == c) {
                count++;
                if (count > output) {
                    output = count;
                }
            } else if (')' == c){
                count--;
            }
        }
        return output;
    }
}
