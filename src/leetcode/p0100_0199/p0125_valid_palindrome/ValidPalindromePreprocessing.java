/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0125_valid_palindrome;

public class ValidPalindromePreprocessing implements ValidPalindrome {
    @Override
    public boolean isPalindrome(String s) {
        char[] chars = s.replaceAll("[^A-Za-z0-9]", "")
                .toCharArray();
        int dif = 'a' - 'A';
        int len = chars.length;
        boolean flag = true;
        for (int i = 0; i < len / 2; i++) {
            char l = chars[i];
            char r = chars[len - 1 - i];
            if ('0' <= l && l <= '9') {
                if (l != r) {
                    flag = false;
                    break;
                }
            } else if ('A' <= l && l <= 'Z') {
                boolean match = l == r || r - l == dif;
                if (!match) {
                    flag = false;
                    break;
                }
            } else if ('a' <= l && l <= 'z') {
                boolean match = l == r || l - r == dif;
                if (!match) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
