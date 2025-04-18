/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface ReverseInteger {
    /**
     * Given a sighed 32-bit integer x, return x with its digits
     * reversed. If reversing x causes the value to go outside the
     * signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
     *
     * Assume the environment does not allow you to store 64-bit
     * integers (signed or unsigned).
     *
     * @param x -2^31 <= x <= 2^32 - 1
     * @return reversed x
     */
    int reverseInteger(int x);
}
