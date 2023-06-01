package org.willxu.algorithm.service.integer;

public interface BasicCalculatorIi {
    /**
     * Given a string s which represents an expression, evaluate this
     * expression and return its value.
     * <p>
     * The integer division should truncate toward zero.
     * <p>
     * You may assume that the given expression is always valid. All
     * intermediate results will be in the range of [-2^31, 2^31 - 1].
     * <p>
     * Note: You are not allowed to use any built-in function which
     * evaluates strings as mathematical expressions, such as eval().
     *
     * @param s 1 <= s.length <= 3 * 10^5
     *          s consists of integers and operators
     *          ('+', '-', '*', '/') separated by some number of spaces.
     *          s represents a valid expression.
     *          All the integers in the expression are non-negative
     *          integers in the range [0, 231 - 1].
     *          The answer is guaranteed to fit in a 32-bit integer.
     */
    int calculate(String s);
}
