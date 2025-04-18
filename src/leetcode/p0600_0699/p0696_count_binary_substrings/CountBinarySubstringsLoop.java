/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0696_count_binary_substrings;

public class CountBinarySubstringsLoop implements CountBinarySubstrings {
    @Override
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        int count0 = 0;
        int count1 = 0;
        boolean lead0 = chars[0] == '0';
        for (char c: chars) {
            if (c == '0') {
                if (count1 == 0) {
                    // only lead 0;
                    count0++;
                } else {
                    if (lead0) {
                        count += Math.min(count0, count1);
                        // last char is '1'
                        count0 = 1;
                        lead0 = false;
                    } else {
                        count0++;
                    }
                }
            } else {
                if (count0 == 0) {
                    // only lead 1;
                    count1++;
                } else {
                    if (lead0) {
                        count1++;
                    } else {
                        count += Math.min(count0, count1);
                        count1 = 1;
                        lead0 = true;
                    }
                }
            }
        }
        return count + Math.min(count0, count1);
    }
}
