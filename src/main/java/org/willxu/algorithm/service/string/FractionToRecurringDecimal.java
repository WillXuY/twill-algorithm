package org.willxu.algorithm.service.string;

public interface FractionToRecurringDecimal {
    /**
     * Given two integers representing the numerator and denominator of
     * a fraction, return the fraction in string format.
     * <p>
     * If the fractional part is repeating, enclose the repeating part
     * in parentheses.
     * <p>
     * If multiple answers are possible, return any of them.
     * <p>
     * It is guaranteed that the length of the answer string is less
     * than 104 for all the given inputs.
     *
     * @param numerator -2^31 <= numerator, denominator <= 2^31 - 1
     * @param denominator denominator != 0
     */
    String fractionToDecimal(int numerator, int denominator);
}
