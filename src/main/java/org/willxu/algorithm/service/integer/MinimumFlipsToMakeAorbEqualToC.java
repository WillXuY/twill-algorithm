package org.willxu.algorithm.service.integer;

public interface MinimumFlipsToMakeAorbEqualToC {
    /**
     * Given 3 positives numbers a, b and c. Return the minimum flips
     * required in some bits of a and b to make ( a OR b == c ).
     * (bitwise OR operation).
     * <p>
     * Flip operation consists of change any single bit 1 to 0 or change
     * the bit 0 to 1 in their binary representation.
     *
     * @param a 1 <= a <= 10^9
     * @param b 1 <= b <= 10^9
     * @param c 1 <= c <= 10^9
     */
    int minFlips(int a, int b, int c);
}
