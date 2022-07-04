package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumChangesToMakeAlternatingBinaryString;

public class MinimumChangesToMakeAlternatingBinaryStringCount
        implements MinimumChangesToMakeAlternatingBinaryString {
    @Override
    public int minOperations(String s) {
        int letFirst1 = 0;
        int letFirst0 = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((i & 1) == 0) {
                if (chars[i] == '0') {
                    letFirst1++;
                } else {
                    letFirst0++;
                }
            } else {
                if (chars[i] == '0') {
                    letFirst0++;
                } else {
                    letFirst1++;
                }
            }
        }
        return Math.min(letFirst0, letFirst1);
    }
}
