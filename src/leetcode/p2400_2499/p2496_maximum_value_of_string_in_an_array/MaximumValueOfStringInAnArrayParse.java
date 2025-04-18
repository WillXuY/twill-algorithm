package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumValueOfStringInAnArray;

public class MaximumValueOfStringInAnArrayParse
        implements MaximumValueOfStringInAnArray {
    @Override
    public int maximumValue(String[] strs) {
        int output = -1;
        for (String s: strs) {
            int num;
            try {
                num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                num = s.length();
            }
            if (num > output) {
                output = num;
            }
        }
        return output;
    }
}
