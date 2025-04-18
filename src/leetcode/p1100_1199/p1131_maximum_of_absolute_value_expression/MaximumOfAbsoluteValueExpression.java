package leetcode.p1100_1199.p1131_maximum_of_absolute_value_expression;

public interface MaximumOfAbsoluteValueExpression {
    /**
     * Given two arrays of integers with equal lengths, return the
     * maximum value of:
     * <p>
     * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
     * <p>
     * where the maximum is taken over all 0 <= i, j < arr1.length.
     * <p>
     * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
     * <p>
     * 1. set i always larger than or equals j.
     * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + i - j
     * 2. has 4 possible abs
     * arr1[i] - arr1[j] + arr2[i] - arr2[j] + i - j
     * arr1[i] - arr1[j] - arr2[i] + arr2[j] + i - j
     * - arr1[i] + arr1[j] + arr2[i] - arr2[j] + i - j
     * - arr1[i] + arr1[j] - arr2[i] + arr2[j] + i - j
     * <p>
     * arr1[i] + arr2[i] + i - arr1[j] - arr2[j] - j
     * arr1[i] - arr2[i] + i - arr1[j] + arr2[j] - j
     * - arr1[i] + arr2[i] + i + arr1[j] - arr2[j] - j
     * - arr1[i] - arr2[i] + i + arr1[j] + arr2[j] - j
     * <p>
     * arr1[i] + arr2[i] + i - (arr1[j] + arr2[j] + j)
     * arr1[i] - arr2[i] + i - (arr1[j] - arr2[j] + j)
     * - arr1[i] + arr2[i] + i - (-arr1[j] + arr2[j] + j)
     * - arr1[i] - arr2[i] + i - (-arr1[j] - arr2[j] + j)
     *
     *
     * @param arr1,arr2 2 <= arr1.length == arr2.length <= 40000
     *                  -10^6 <= arr1[i], arr2[i] <= 10^6
     */
    int maxAbsValExpr(int[] arr1, int[] arr2);
}
