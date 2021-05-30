package org.willxu.algorithm.service.stringlist;

import java.util.List;

public interface ExpressionAndOperatorService {
    /**
     * https://leetcode.com/problems/expression-add-operators/
     * 282.Expression Add Operators
     *
     * Given a string that contains only digits 0-9 and a target value, return
     * add possibilities to add binary operators(not unary) +, -, or * between
     * the digits so they evaluate to the target value.
     *
     * Constraints:
     * 1. 0 <= num.length <= 10;
     * 2. num only contain digits.
     */
    List<String> getExpressionAddOperator(String num, int target);
}
