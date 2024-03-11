package org.willxu.algorithm.service.bool;

public interface ReorderedPowerOf2 {
    /**
     * You are given an integer n. We reorder the digits in any order
     * (including the original order) such that the leading digit is not
     * zero.
     * <p>
     * Return true if and only if we can do this so that the resulting
     * number is a power of two.
     *
     * @param n 1 <= n <= 10^9
     */
    boolean reorderedPowerOf2(int n);
}
