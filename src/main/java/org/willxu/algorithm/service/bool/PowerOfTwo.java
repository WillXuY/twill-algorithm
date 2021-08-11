/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface PowerOfTwo {
    /**
     * Given an integer n, return true if it is a power of two.
     * Otherwise, return false.
     *
     * An integer n is a power of two, if there exists an integer x such
     * that n == 2^x.
     *
     * @param n -2^31 <= n <= 2^31 - 1
     * @return is power of two or not.
     */
    boolean isPowerOfTwo(int n);
}
