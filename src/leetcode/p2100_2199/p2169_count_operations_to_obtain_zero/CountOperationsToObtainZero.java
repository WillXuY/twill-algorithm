package org.willxu.algorithm.service.integer;

public interface CountOperationsToObtainZero {
    /**
     * You are given two non-negative integers num1 and num2.
     * <p>
     * In one operation, if num1 >= num2, you must subtract num2 from
     * num1, otherwise subtract num1 from num2.
     * <p>
     * - For example, if num1 = 5 and num2 = 4, subtract num2 from num1,
     *   thus obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and
     *   num2 = 5, after one operation, num1 = 4 and num2 = 1.
     * <p>
     * Return the number of operations required to make either num1 = 0 or num2 = 0.
     *
     * @param num1,num2 0 <= num1, num2 <= 10^5
     */
    int countOperations(int num1, int num2);
}
