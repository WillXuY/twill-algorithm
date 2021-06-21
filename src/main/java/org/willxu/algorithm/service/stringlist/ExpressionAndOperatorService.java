package org.willxu.algorithm.service.stringlist;

import java.util.List;

public interface ExpressionAndOperatorService {
    /**
     * Given a string that contains only digits 0-9 and a target value,
     * return add possibilities to add binary operators(not unary) +,
     * -, or * between the digits so they evaluate to the target value.
     *
     * @param num 1 <= num.length <= 10
     *            num only contain digits.
     * @param target -2^31 <= target <= 2^31 - 1
     * @return result list
     */
    List<String> addOperators(String num, int target);
}
