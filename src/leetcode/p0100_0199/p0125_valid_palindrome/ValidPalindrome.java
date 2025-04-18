/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0125_valid_palindrome;

public interface ValidPalindrome {
    /**
     * Given a string s, determine if it is a palindrome, considering
     * only alphanumeric characters and ignoring cases.
     *
     * @param s 1 <= s.length <= 2 * 10^5
     *          s consists only of printable ASCII characters.
     * @return palindrome or not
     */
    boolean isPalindrome(String s);
}
