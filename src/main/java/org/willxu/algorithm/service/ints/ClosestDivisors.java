package org.willxu.algorithm.service.ints;

public interface ClosestDivisors {
    /**
     * Given an integer num, find the closest two integers in absolute
     * difference whose product equals num + 1 or num + 2.
     * <p>
     * Return the two integers in any order.
     *
     * @param num 1 <= num <= 10^9
     */
    int[] closestDivisors(int num);
}
