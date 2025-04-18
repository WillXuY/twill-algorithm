package org.willxu.algorithm.service.integer;

public interface NumberOfStepsToReduceNumberInBinaryRepresentationToOne {
    /**
     * Given the binary representation of an integer as a string s,
     * return the number of steps to reduce it to 1 under the following
     * rules:
     * <p>
     * - If the current number is even, you have to divide it by 2.
     * <p>
     * - If the current number is odd, you have to add 1 to it.
     * <p>
     * It is guaranteed that you can always reach one for all test cases.
     *
     * @param s 1 <= s.length <= 500
     *          consists of characters '0' or '1'
     *          s[0] == '1'
     */
    int numSteps(String s);
}
