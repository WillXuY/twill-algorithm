package org.willxu.algorithm.service.string;

public interface Largest3SameDigitNumberInString {
    /**
     * You are given a string num representing a large integer. An
     * integer is good if it meets the following conditions:
     * <p>
     * - It is a substring of num with length 3.
     * - It consists of only one unique digit.
     * <p>
     * Return the maximum good integer as a string or an empty string ""
     * if no such integer exists.
     * <p>
     * Note:
     * <p>
     * - A substring is a contiguous sequence of characters within a
     *   string.
     * - There may be leading zeroes in num or a good integer.
     *
     * @param num 3 <= num.length <= 1000
     *            num only consists of digits.
     */
    String largestGoodInteger(String num);
}
