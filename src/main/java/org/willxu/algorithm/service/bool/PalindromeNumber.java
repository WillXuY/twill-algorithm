/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface PalindromeNumber {
    /**
     * Given an integer x, return true if x is palindrome integer.
     * An integer is a palindrome when it reads the same backward as
     * forward.
     *
     * For example, 121 is palindrome while 123 is not.
     *
     * @param x -2^31 <= x <= 2^31 - 1
     * @return check palindrome integer
     */
    boolean isPalindrome(int x);
}
