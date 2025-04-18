package org.willxu.algorithm.service.integer;

public interface NumberOfStepsToReduceNumberToZero {
    /**
     * Given an integer num, return the number of steps to reduce it to
     * zero.
     * In one step, if the current number is even, you have to divide it
     * by 2, otherwise, you have to subtract 1 from it.
     *
     * @param num 0 <= num <= 10^6
     * @return steps to reduce num to zero.
     */
    int numberOfSteps(int num);
}
