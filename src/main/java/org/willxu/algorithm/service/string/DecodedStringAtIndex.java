package org.willxu.algorithm.service.string;

public interface DecodedStringAtIndex {
    /**
     * You are given an encoded string s. To decode the string to a
     * tape, the encoded string is read one character at a time and the
     * following steps are taken:
     * <p>
     * - If the character read is a letter, that letter is written onto
     *   the tape.
     * - If the character read is a digit d, the entire current tape is
     *   repeatedly written d - 1 more times in total.
     * <p>
     * Given an integer k, return the kth letter (1-indexed) in the
     * decoded string.
     *
     * @param s 2 <= s.length <= 100
     *          consists of lowercase English letters and digits 2
     *          through 9.
     *          starts with a letter.
     * @param k 1 <= k <= 10^9
     *          It is guaranteed that k is less than or equal to the
     *          length of the decoded string.
     *          The decoded string is guaranteed to have less than
     *          2^63 letters.
     */
    String decodeAtIndex(String s, int k);
}
