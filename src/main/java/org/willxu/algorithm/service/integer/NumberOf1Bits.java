package org.willxu.algorithm.service.integer;

public interface NumberOf1Bits {
    /**
     * Write a function that takes an unsigned integer and returns the
     * number of '1' bits it has (also known as the Hamming weight).
     *
     * Note:
     * - Note that in some languages, such as Java, there is no
     *   unsigned integer type. It should not affect your
     *   implementation, as the integer's internal binary
     *   representation is the same, whether it is signed or unsigned.
     *
     * - In Java, the compiler represents the signed integers using 2's
     *   complement notation. Therefore, in Example3, the input
     *   represents the signed integer. -3.
     *
     * @param n must be a binary string of length 32.
     * @return hamming weight, the number of '1' bits.
     */
    int hammingWeight(int n);
}
