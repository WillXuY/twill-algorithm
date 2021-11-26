/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface OneBitAnd2BitCharacters {
    /**
     * We have two special characters:
     * - The first character can be represented by one bit 0.
     * - The second character can be represented by two bits(10 or 11).
     * Given a binary array bits that ends with 0, return true if the
     * last character must be a one-bit character.
     *
     * Possible end:
     * end with 10: 1110 1010 010
     * end with 0:   110  100  00
     * length - 1 must = 0
     * if length - 2 is 0
     * if length - 3 is not 0
     * then end will be 110.
     *  0  11  10
     * 01 101 111
     * if length -4 is 0
     * if length -5 is not 0
     * then end will be 11
     *  0  10  11
     * 01 101 111
     *
     * @param bits 1 <= bits.length <= 1000
     *             bits[i] is either 0 or 1.
     * @return the last character be a one-bit character.
     */
    boolean isOneBitCharacter(int[] bits);
}
