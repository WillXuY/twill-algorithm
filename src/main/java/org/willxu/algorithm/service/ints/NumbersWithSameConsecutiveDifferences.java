package org.willxu.algorithm.service.ints;

public interface NumbersWithSameConsecutiveDifferences {
    /**
     * Given two integers n and k, return an array of all the integers
     * of length n where the difference between every two consecutive
     * digits is k. You may return the answer in any order.
     * <p>
     * Note that the integers should not have leading zeros. Integers as
     * 02 and 043 are not allowed.
     *
     * @param n 2 <= n <= 9
     * @param k 0 <= k <= 9
     */
    int[] numsSameConsecDiff(int n, int k);
}
