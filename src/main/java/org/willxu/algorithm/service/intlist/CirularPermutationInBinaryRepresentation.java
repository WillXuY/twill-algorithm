package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface CirularPermutationInBinaryRepresentation {
    /**
     * Given 2 integers n and start. Your task is return any permutation
     * p of (0,1,2.....,2^n -1) such that :
     * <p>
     * - p[0] = start
     * - p[i] and p[i+1] differ by only one bit in their binary
     *   representation.
     * - p[0] and p[2^n -1] must also differ by only one bit in their
     *   binary representation.
     *
     * @param n 1 <= n <= 16
     * @param start 0 <= start < 2 ^ n
     */
    List<Integer> circularPermutation(int n, int start);
}
