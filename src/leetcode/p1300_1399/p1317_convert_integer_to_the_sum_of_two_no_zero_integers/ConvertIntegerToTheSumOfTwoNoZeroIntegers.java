package org.willxu.algorithm.service.ints;

public interface ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    /**
     * No-Zero integer is a positive integer that does not contain any 0
     * in its decimal representation.
     * Given an integer n, return a list of two integers [A, B] where:
     * - A and B are No-Zero integers.
     * - A + B = n
     * The test cases are generated so that there is at least one valid
     * solution. If there are many valid solutions you can return any of
     * them.
     *
     * @param n 2 <= n <= 10^4
     * @return No-Zero integers which's sum equals n.
     */
    int[] getNoZeroIntegers(int n);
}
