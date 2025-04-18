/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefixBruteForce implements LongestCommonPrefix {
    @Override
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        char[] result = strs[0].toCharArray();
        for (int i = 1; i < strs.length; i++) {
            char[] thisStr = strs[i].toCharArray();
            int thisLen = strs[i].length();
            int len = result.length;
            for (int j = 0; j < len; j++) {
                if (j >= thisLen) {
                    result = Arrays.copyOfRange(result, 0, thisLen);
                    j = len;
                }else if (result[j] != thisStr[j]) {
                    if (j == 0) {
                        return "";
                    }
                    result = Arrays.copyOfRange(result, 0, j);
                    j = len;
                }
            }
        }
        return new String(result);
    }
}
