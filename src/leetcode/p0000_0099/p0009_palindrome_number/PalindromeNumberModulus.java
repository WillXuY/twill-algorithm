/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0009_palindrome_number;

public class PalindromeNumberModulus implements PalindromeNumber {
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }
        // reverse
        int reverse = x % 10;
        int quotient = x / 10;
        while (quotient > 0) {
            reverse *= 10;
            reverse += quotient % 10;
            quotient /= 10;
        }
        return reverse == x;
    }
}
