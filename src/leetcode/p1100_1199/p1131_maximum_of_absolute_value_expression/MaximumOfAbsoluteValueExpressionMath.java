package leetcode.p1100_1199.p1131_maximum_of_absolute_value_expression;

public class MaximumOfAbsoluteValueExpressionMath
        implements MaximumOfAbsoluteValueExpression {
    /**
     * All possible absolute value:
     * 1. arr1[i] + arr2[i] + i - (arr1[j] + arr2[j] + j)
     * 2. arr1[i] - arr2[i] + i - (arr1[j] - arr2[j] + j)
     * 3. - arr1[i] + arr2[i] + i - (-arr1[j] + arr2[j] + j)
     * 4. - arr1[i] - arr2[i] + i - (-arr1[j] - arr2[j] + j)
     */
    @Override
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        int min4 = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            max1 = Math.max(max1, i + arr1[i] + arr2[i]);
            min1 = Math.min(min1, i + arr1[i] + arr2[i]);
            max2 = Math.max(max2, i + arr1[i] - arr2[i]);
            min2 = Math.min(min2, i + arr1[i] - arr2[i]);
            max3 = Math.max(max3, i - arr1[i] + arr2[i]);
            min3 = Math.min(min3, i - arr1[i] + arr2[i]);
            max4 = Math.max(max4, i - arr1[i] - arr2[i]);
            min4 = Math.min(min4, i - arr1[i] - arr2[i]);
        }
        int result = Math.abs(max1 - min1);
        result = Math.max(result, Math.abs(max2 - min2));
        result = Math.max(result, Math.abs(max3 - min3));
        result = Math.max(result, Math.abs(max4 - min4));
        return result;
    }
}
