package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface AddToArrayFormOfInteger {
    /**
     * The array-form of an integer num is an array representing its
     * digits in left to right order.
     * - For example, for num = 1321, the array form is [1, 3, 2, 1].
     * Given num, the array-form of an integer, and an integer k, return
     * the array-form of the integer num + k.
     *
     * @param num 1 <= num.length <= 10^4
     *            0 <= num[i] <= 9
     *            does not contain any leading zeros except for the zero
     *            itself.
     * @param k 1 <= k <= 10^4
     * @return sum of num and k.
     */
    List<Integer> addToArrayForm(int[] num, int k);
}
