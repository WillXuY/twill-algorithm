package org.willxu.algorithm.service.bool;

public interface CheckIfStringContainsAllBinaryCodesOfSizeK {
    /**
     * Given a binary string s and an integer k, return true if every
     * binary code of length k is a substring of s. Otherwise, return
     * false.
     *
     * @param s 1 <= s.length <= 5 * 10^5
     *          s[i] is either '0' or '1'.
     * @param k 1 <= k <= 20
     */
    boolean hasAllCodes(String s, int k);
}
