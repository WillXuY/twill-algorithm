package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ShuffleString;

public class ShuffleStringIndex implements ShuffleString {
    @Override
    public String restoreString(String s, int[] indices) {
        char[] output = new char[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            output[indices[i]] = chars[i];
        }
        return new String(output);
    }
}
