/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface BinaryNumberWithAlternatingBits {
    /**
     * Given a positive integer, check whether it has alternating bits:
     * namely, if two adjacent bits will always have different values.
     *
     * @param n 1 <= n <= 2^31 - 1
     * @return has alternating bits.
     */
    boolean hasAlternatingBits(int n);
}
