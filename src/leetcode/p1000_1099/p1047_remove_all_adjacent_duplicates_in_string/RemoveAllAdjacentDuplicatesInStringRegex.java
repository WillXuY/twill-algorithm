package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.RemoveAllAdjacentDuplicatesInString;

public class RemoveAllAdjacentDuplicatesInStringRegex
        implements RemoveAllAdjacentDuplicatesInString {
    @Override
    public String removeDuplicates(String s) {
        while (s.length() > 0) {
            String newStr = s.replaceAll("([a-z])\\1", "");
            if (s.equals(newStr)) {
                break;
            } else {
                s = newStr;
            }
        }
        return s;
    }
}
