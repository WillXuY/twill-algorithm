package org.willxu.algorithm.service.string;

public interface RemoveDigitFromNumberToMaximizeResult {
    /**
     * You are given a string number representing a positive integer and
     * a character digit.
     * <p>
     * Return the resulting string after removing exactly one occurrence
     * of digit from number such that the value of the resulting string
     * in decimal form is maximized. The test cases are generated such
     * that digit occurs at least once in number.
     *
     * @param number 2 <= number.length <= 100
     *               number consists of digits from '1' to '9'.
     * @param digit digit is a digit from '1' to '9'.
     *              digit occurs at least once in number.
     */
    String removeDigit(String number, char digit);
}
