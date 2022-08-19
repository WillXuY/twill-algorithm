package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfStringIsPrefixOfArray;

public class CheckIfStringIsPrefixOfArrayEquals
        implements CheckIfStringIsPrefixOfArray {
    @Override
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String w: words) {
            if (stringBuilder.length() >= s.length()) {
                break;
            }
            stringBuilder.append(w);
        }
        return stringBuilder.toString().equals(s);
    }
}
