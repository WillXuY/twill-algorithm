package org.willxu.algorithm.service.string;

public interface StringWithoutAaaOrBbb {
    /**
     * Given two integers a and b, return any string s such that:
     * <p>
     * - s has length a + b and contains exactly a 'a' letters, and
     *   exactly b 'b' letters,
     * - The substring 'aaa' does not occur in s, and
     * - The substring 'bbb' does not occur in s.
     *
     * @param a,b 0 <= a, b <= 100
     *            It is guaranteed such an s exists for the given a and
     *            b.
     */
    String strWithout3a3b(int a, int b);
}
