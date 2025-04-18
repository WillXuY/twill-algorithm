package leetcode.p0100_0199.p0150_evaluate_reverse_polish_notation;

public interface EvaluateReversePolishNotation {
    /**
     * You are given an array of strings tokens that represents an
     * arithmetic expression in a Reverse Polish Notation.
     * <p>
     * Evaluate the expression. Return an integer that represents the
     * value of the expression.
     * <p>
     * Note that:
     * <p>
     * - The valid operators are '+', '-', '*', and '/'.
     * - Each operand may be an integer or another expression.
     * - The division between two integers always truncates toward zero.
     * - There will not be any division by zero.
     * - The input represents a valid arithmetic expression in a reverse
     *   polish notation.
     * - The answer and all the intermediate calculations can be
     *   represented in a 32-bit integer.
     *
     * @param tokens 1 <= tokens.length <= 10^4
     *               tokens[i] is either an operator: "+", "-", "*", or
     *               "/", or an integer in the range [-200, 200].
     */
    int evalRPN(String[] tokens);
}
