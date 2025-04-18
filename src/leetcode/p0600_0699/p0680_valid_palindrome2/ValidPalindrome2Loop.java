/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0680_valid_palindrome2;

public class ValidPalindrome2Loop implements ValidPalindrome2 {
    @Override
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < (chars.length - 1) / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                if (chars[i + 1] == chars[chars.length - 1 - i]) {
                    // remove the left.
                    for (int j = i; j < (chars.length - 1) / 2; j++) {
                        if (chars[j + 1] != chars[chars.length - 1 - j]) {
                            break;
                        }
                        if (j == (chars.length - 1) / 2 - 1) {
                            return true;
                        }
                    }
                }
                if (chars[i] == chars[chars.length - 2 - i]) {
                    // remove the right.
                    for (int j = i; j < (chars.length - 1) / 2; j++) {
                        if (chars[j] != chars[chars.length - 2 - j]) {
                            break;
                        }
                        if (j == (chars.length - 1) / 2 - 1) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
