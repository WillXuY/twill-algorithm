package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.service.empty.ReverseString;

public class ReverseStringExchange implements ReverseString {
    @Override
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }
    }
}
