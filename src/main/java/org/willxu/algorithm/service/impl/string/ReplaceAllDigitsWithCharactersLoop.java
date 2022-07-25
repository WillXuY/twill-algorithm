package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.ReplaceAllDigitsWithCharacters;

public class ReplaceAllDigitsWithCharactersLoop
        implements ReplaceAllDigitsWithCharacters {
    @Override
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            chars[i] = (char) (chars[i - 1] + chars[i] - '0');
        }
        return new String(chars);
    }
}
