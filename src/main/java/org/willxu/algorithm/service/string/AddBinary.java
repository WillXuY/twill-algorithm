package org.willxu.algorithm.service.string;

public interface AddBinary {
    /**
     * Given two binary strings a and b, return their sum as a binary
     * string.
     *
     * Constraints:
     * Each string does not contain leading zeros except for the zero
     * itself.
     *
     * @param a 1 <= a.length <= 10^4
     *          consist only of '0' or '1' characters.
     * @param b 1 <= b.length <= 10^4
     *          consist only of '0' or '1' characters.
     * @return sum of a and b
     */
    String addBinary(String a, String b);
}
