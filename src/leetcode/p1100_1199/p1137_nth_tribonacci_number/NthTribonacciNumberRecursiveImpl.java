/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p1100_1199.p1137_nth_tribonacci_number;

public class NthTribonacciNumberRecursiveImpl implements NthTribonacciNumberService {
    /**
     * try the recursive
     * 用时过久： 6s
     * 1. 调整 if 顺序与组合 5s
     * 用时还是过久
     * @param n the input number n
     * @return the N-th Tribonacci Number
     */
    @Override
    public int getNthTribonacciNumber(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        return getNthTribonacciNumber(n - 1) + getNthTribonacciNumber(n - 2) + getNthTribonacciNumber(n - 3);
    }
}
