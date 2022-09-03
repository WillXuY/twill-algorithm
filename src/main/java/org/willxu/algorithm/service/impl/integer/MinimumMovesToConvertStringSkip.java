package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumMovesToConvertString;

public class MinimumMovesToConvertStringSkip
        implements MinimumMovesToConvertString {
    @Override
    public int minimumMoves(String s) {
        int output = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'X') {
                output++;
                i += 2;
            }
        }
        return output;
    }
}
