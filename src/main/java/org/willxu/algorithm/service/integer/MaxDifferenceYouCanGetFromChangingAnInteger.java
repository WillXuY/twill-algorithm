package org.willxu.algorithm.service.integer;

public interface MaxDifferenceYouCanGetFromChangingAnInteger {
    /**
     * You are given an integer num. You will apply the following steps
     * exactly two times:
     * <p>
     * - Pick a digit x (0 <= x <= 9).
     * - Pick another digit y (0 <= y <= 9). The digit y can be equal to
     *   x.
     * - Replace all the occurrences of x in the decimal representation
     *   of num by y.
     * - The new integer cannot have any leading zeros, also the new
     *   integer cannot be 0.
     * <p>
     * Let a and b be the results of applying the operations to num the
     * first and second times, respectively.
     * <p>
     * Return the max difference between a and b.
     *
     * @param num 1 <= num <= 10^8
     */
    int maxDiff(int num);
}
