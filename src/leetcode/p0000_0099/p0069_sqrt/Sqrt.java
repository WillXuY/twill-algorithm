/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface Sqrt {

    /**
     * Given a non-negative integer x, compute and return the square
     * root of x.
     *
     * Since the return type is an integer, the decimal digits are
     * truncated, and only te integer part of the result is returned.
     *
     * Note: You are not allowed to use any built-in exponent function
     * or operator, such as pow(x, 0.5) or x ** 0.5.
     *
     * @param x 0 <= x <= 2^31 - 1
     * @return square root of x.
     */
    int mySqrt(int x);
}
