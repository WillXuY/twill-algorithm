package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface DifferentWaysToAddParentheses {
    /**
     * Given a string expression of numbers and operators, return all
     * possible results from computing all the different possible ways
     * to group numbers and operators. You may return the answer in any
     * order.
     * <p>
     * The test cases are generated such that the output values fit in a
     * 32-bit integer and the number of different results does not
     * exceed 10^4.
     *
     * @param expression 1 <= expression.length <= 20
     *                   expression consists of digits and the operator
     *                   '+', '-', and '*'.
     *                   All the integer values in the input expression
     *                   are in the range [0, 99].
     */
    List<Integer> diffWaysToCompute(String expression);
}
