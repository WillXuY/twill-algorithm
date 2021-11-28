/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface SelfDividingNumbers {
    /**
     * A self-dividing number is a number that is divisible by every
     * digit it contains.
     * - For example, 128 is a self-dividing number because
     *   128 % 1 == 0, 128 % 2 == 0, 128 % 8 == 0.
     * A self-dividing number is not allowed to contain the digit zero.
     * Given two integers left and right, return a list of all the
     * self-dividing numbers in the range [left, right].
     *
     * @param left 1 <= left <= right <= 10^4
     * @param right 1 <= left <= right <= 10^4
     * @return list of self dividing numbers between left and right.
     */
    List<Integer> selfDividingNumbers(int left, int right);
}
