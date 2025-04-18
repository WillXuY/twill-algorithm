/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

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
