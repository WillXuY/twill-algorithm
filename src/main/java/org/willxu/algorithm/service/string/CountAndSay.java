package org.willxu.algorithm.service.string;

public interface CountAndSay {
    /**
     * The count-and-say sequence is a sequence of digit strings defined
     * by the recursive formula:
     * <p>
     * - countAndSay(1) = "1"
     * - countAndSay(n) is the way you would "say" the digit string from
     *   countAndSay(n-1), which is then converted into a different digit
     *   string.
     * <p>
     * To determine how you "say" a digit string, split it into the
     * minimal number of substrings such that each substring contains
     * exactly one unique digit. Then for each substring, say the number
     * of digits, then say the digit. Finally, concatenate every said
     * digit.
     * <p>
     * For example, the saying and conversion for digit string "3322251":
     * two 3's, three 2's, one 5, and one 1
     * 2 3 + 3 2 + 1 5 + 11
     * "23321511"
     * <p>
     * Given a positive integer n, return the nth term of the
     * count-and-say sequence.
     *
     * @param n 1 <= n <= 30
     */
    String countAndSay(int n);
}
