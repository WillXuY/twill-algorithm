package org.willxu.algorithm.service.integer;

public interface NumberOfTimesBinaryStringIsPrefixAligned {
    /**
     * You have a 1-indexed binary string of length n where all the bits
     * are 0 initially. We will flip all the bits of this binary string
     * (i.e., change them from 0 to 1) one by one. You are given a
     * 1-indexed integer array flips where flips[i] indicates that the
     * bit at index i will be flipped in the i^th step.
     * <p>
     * A binary string is prefix-aligned if, after the ith step, all the
     * bits in the inclusive range [1, i] are ones and all the other
     * bits are zeros.
     * <p>
     * Return the number of times the binary string is prefix-aligned
     * during the flipping process.
     *
     * @param flips n == flips.length
     *              1 <= n <= 5 * 10^4
     *              flips is a permutation of the integers in the
     *              range [1, n].
     */
    int numTimesAllBlue(int[] flips);
}
