/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0762_prime_number_of_set_bits_in_binary_representation;

public interface PrimeNumberOfSetBitsInBinaryRepresentation {
    /**
     * Given two integers left and right, return the count of numbers in
     * the inclusive range [left, right] having a prime number of set
     * bits in their binary representation.
     * Recall that the number of set bits an integer has is the number
     * of 1's present when written in binary.
     * - For example, 21 written in binary is 10101, which has 3 set
     *   bits.
     *
     * @param left 1 <= left <= right <= 10^6
     *             0 <= right - left <= 10^4
     * @param right 1 <= left <= right <= 10^6
     *             0 <= right - left <= 10^4
     * @return count of prime set bits.
     */
    int countPrimeSetBits(int left, int right);
}
