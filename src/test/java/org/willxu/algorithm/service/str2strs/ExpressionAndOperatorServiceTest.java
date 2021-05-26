package org.willxu.algorithm.service.str2strs;

import org.willxu.algorithm.service.impl.str2strs.ExpressionAndOperatorServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExpressionAndOperatorServiceTest {
    private final ExpressionAndOperatorService bruteForce = new ExpressionAndOperatorServiceImpl();

    @Test
    public void expressionAddOperatorBruteForce() {
        int target = 5;
        String num = "105";
        List<String> output = bruteForce.getExpressionAddOperator(num, target);
        System.out.println(output);
    }
}
