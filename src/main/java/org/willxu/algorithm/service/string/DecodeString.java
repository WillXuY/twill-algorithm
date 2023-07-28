package org.willxu.algorithm.service.string;

public interface DecodeString {
    /**
     * Given an encoded string, return its decoded string.
     * <p>
     * The encoding rule is: k[encoded_string], where the encoded_string
     * inside the square brackets is being repeated exactly k times.
     * Note that k is guaranteed to be a positive integer.
     * <p>
     * You may assume that the input string is always valid; there are
     * no extra white spaces, square brackets are well-formed, etc.
     * Furthermore, you may assume that the original data does not
     * contain any digits and that digits are only for those repeat
     * numbers, k. For example, there will not be input like 3a or 2[4].
     * <p>
     * The test cases are generated so that the length of the output
     * will never exceed 10^5.
     *
     * @param s 1 <= s.length <= 30
     *          consists of lowercase English letters, digits, and
     *          square brackets '[]'.
     *          is guaranteed to be a valid input.
     *          All the integers in s are in the range [1, 300].
     */
    String decodeString(String s);
}
