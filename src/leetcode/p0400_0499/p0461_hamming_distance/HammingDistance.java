package org.willxu.algorithm.service.integer;

public interface HammingDistance {
    /**
     * The Hamming distance between two integers is the number of
     * positions at which the corresponding bits are different.
     * Given two integers x and y, return the Hamming distance between
     * them.
     *
     * @param x 0 <= x <= 2^31 - 1
     * @param y 0 <= y <= 2^31 - 1
     * @return the different bits number.
     */
    int hammingDistance(int x, int y);
}
