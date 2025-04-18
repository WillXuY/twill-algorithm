/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0013_roman_to_integer;

public class RomanToIntegerBruteForce implements RomanToInteger {
    /**
     * Brute Force.
     *
     * @param s 1<= s.length <= 15, contains only the characters
     *          ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     *          It is guaranteed that s is a valid roman numeral in the
     *          range [1, 3999].
     * @return integer number equals Roman number.
     */
    @Override
    public int romanToInteger(String s) {
        int r = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'M') {
                r += 1000;
            } else if (c[i] == 'D') {
                r += 500;
            } else if (c[i] == 'C') {
                if (i == c.length - 1) {
                    r += 100;
                } else if (c[i + 1] == 'M') {
                    r += 900;
                    i++;
                } else if (c[i + 1] == 'D') {
                    r += 400;
                    i++;
                } else {
                    r += 100;
                }
            } else if (c[i] == 'L') {
                r += 50;
            } else if (c[i] == 'X') {
                if (i == c.length - 1) {
                    r += 10;
                } else if (c[i + 1] == 'C') {
                    r += 90;
                    i++;
                } else if (c[i + 1] == 'L') {
                    r += 40;
                    i++;
                } else {
                    r += 10;
                }
            } else if (c[i] == 'V') {
                r += 5;
            } else if (c[i] == 'I') {
                if (i == c.length - 1) {
                    r += 1;
                } else if (c[i + 1] == 'X') {
                    r += 9;
                    i++;
                } else if (c[i + 1] == 'V') {
                    r += 4;
                    i++;
                } else {
                    r += 1;
                }
            }
        }
        return r;
    }
}
