package org.willxu.algorithm.service.integer;

public interface DecodeWays {
    /**
     * A message containing letters from A-Z can be encoded into numbers
     * using the following mapping:
     * <p>
     * 'A' -> "1"
     * 'B' -> "2"
     * ...
     * 'Z' -> "26"
     * <p>
     * To decode an encoded message, all the digits must be grouped then
     * mapped back into letters using the reverse of the mapping above
     * (there may be multiple ways). For example, "11106" can be mapped
     * into:
     * <p>
     * - "AAJF" with the grouping (1 1 10 6)
     * - "KJF" with the grouping (11 10 6)
     * <p>
     * Note that the grouping (1 11 06) is invalid because "06" cannot
     * be mapped into 'F' since "6" is different from "06".
     * <p>
     * Given a string s containing only digits, return the number of
     * ways to decode it.
     * <p>
     * The test cases are generated so that the answer fits in a 32-bit
     * integer.
     *
     * @param s 1 <= s.length <= 100
     *          contains only digits and may contain leading zero(s).
     */
    int numDecodings(String s);
}
