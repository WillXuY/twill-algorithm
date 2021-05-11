package com.willxu.algorithm.service.string2stringlist;

import com.willxu.algorithm.service.impl.string2stringlist.ExpressionAndOperatorServiceImpl;
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
