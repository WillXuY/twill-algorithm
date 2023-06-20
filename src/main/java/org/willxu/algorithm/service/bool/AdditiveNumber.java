package org.willxu.algorithm.service.bool;

public interface AdditiveNumber {
    /**
     * An additive number is a string whose digits can form an additive
     * sequence.
     * <p>
     * A valid additive sequence should contain at least three numbers.
     * Except for the first two numbers, each subsequent number in the
     * sequence must be the sum of the preceding two.
     * <p>
     * Given a string containing only digits, return true if it is an
     * additive number or false otherwise.
     * <p>
     * Note: Numbers in the additive sequence cannot have leading zeros,
     * so sequence 1, 2, 03 or 1, 02, 3 is invalid.
     *
     * @param num 1 <= num.length <= 35
     *            num consists only of digits.
     */
    boolean isAdditiveNumber(String num);
}
