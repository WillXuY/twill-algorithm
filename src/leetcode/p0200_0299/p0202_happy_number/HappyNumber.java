/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0202_happy_number;

public interface HappyNumber {
    /**
     * Write an algorithm to determine if a number n is happy.
     *
     * A happy number is a number defined by the following process:
     * - Starting with any positive integer, replace the number by the
     *   sum of the squares of its digits.
     * - Repeat the process until the number equals 1 (where it will
     *   stay), or it loops endlessly in a cycle which does not
     *   include 1.
     * - Those numbers for which this process ends in 1 are happy.
     *
     * @param n 1 <= n <= 2^31 - 1
     * @return true if n is a happy number, and false if not
     */
    boolean isHappy(int n);
}
