package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.GreatestCommonDivisorOfStrings;

public class GreatestCommonDivisorOfStringsLength
        implements GreatestCommonDivisorOfStrings {
    /**
     * 1. Loop the repeat length.
     *
     * @param str1 1 <= str1.length <= 1000
     *             consist of English uppercase letters.
     * @param str2 1 <= str2.length <= 1000
     *             consist of English uppercase letters.
     * @return largest matches sub string.
     */
    @Override
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = len1;
        if (minLength > len2) {
            minLength = len2;
        }
        for (int i = minLength; i > 0; i--) {
            if (len1 % i != 0 || len2 % i != 0) {
                continue;
            }
            String sub = str1.substring(0, i);
            String pattern = "^(" + sub + ")\\1*$";
            if ("".equals(str1.replaceAll(pattern, ""))
                && "".equals(str2.replaceAll(pattern, ""))) {
                return sub;
            }
        }
        return "";
    }
}
