package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ImplementStrStr;

public class ImplementStrStrBruteForce implements ImplementStrStr {
    @Override
    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        // wrong answer 1: h.length == 0 && n.length == 0
        if (n.length == 0) {
            return 0;
        }
        for (int i = 0; i <= h.length - n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (h[i + j] != n[j]) {
                    j = n.length;
                }
                if (j == n.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
