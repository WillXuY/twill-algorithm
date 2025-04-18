package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface GrayCode {
    /**
     * An n-bit gray code sequence is a sequence of 2n integers where:
     * <p>
     * - Every integer is in the inclusive range [0, 2n - 1],
     * - The first integer is 0,
     * - An integer appears no more than once in the sequence,
     * - The binary representation of every pair of adjacent integers
     *   differs by exactly one bit, and
     * - The binary representation of the first and last integers
     *   differs by exactly one bit.
     * <p>
     * Given an integer n, return any valid n-bit gray code sequence.
     * <p>
     * 0 1
     * 00 01 11 10
     * 0   1  3  2
     * 000 001 011 010 110 111 101 100
     *   0   1   3   2   6   7   5   4
     * 0000 0001 0011 0010 0110 0111 0101 0100
     *    0    1    3    2    6    7    5    4
     * 1000 1001 1011 1010 1110 1111 1101 1100
     *    8    9   11   10   14   15   13   12
     *
     * @param n 1 <= n <= 16
     */
    List<Integer> grayCode(int n);
}
