/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface FactorialTrailingZeroes {
    /**
     * Given an integer n, return the number of trailing zeros in n!.
     *
     * Follow up:
     * Could you write a solution that works in logarithmic time
     * complexity?
     *
     * @param n 0 <= n <= 10^4
     * @return trailing zeroes' number
     */
    int trailingZeroes(int n);
}
