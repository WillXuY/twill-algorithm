/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface ReverseBits {
    /**
     * Reverse bits of a given 32 bits unsigned integer.
     *
     * Note:
     * - Note that in some languages such as Java, there is no unsigned
     *   integer type. In this case, both input ans output will be
     *   given as a signed integer type. They should not affect your
     *   implementation, as the integer's internal binary
     *   representation is the same, whether it is signed or unsigned.
     * - In Java, the compiler represents the signed integers using 2's
     *   complement notation. Therefore, in Example 2 above, the input
     *   represents the signed integer -3 and the output represents the
     *   signed integer -1073741825.
     *
     * Follow up:
     * If this function is called many times, how would you optimize it?
     *
     * @param n must be a binary string of length 32
     * @return result of reverse by bits
     */
    int reverseBits(int n);
}
