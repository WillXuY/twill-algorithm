package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumOfAbsoluteValueExpression;

public class MaximumOfAbsoluteValueExpressionLoop
        implements MaximumOfAbsoluteValueExpression {
    @Override
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                int count = Math.abs(arr1[i] - arr1[j])
                        + Math.abs(arr2[i] - arr2[j])
                        + Math.abs(i - j);
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
