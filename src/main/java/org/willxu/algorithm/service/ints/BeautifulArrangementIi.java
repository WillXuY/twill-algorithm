package org.willxu.algorithm.service.ints;

public interface BeautifulArrangementIi {
    /**
     * Given two integers n and k, construct a list answer that contains
     * n different positive integers ranging from 1 to n and obeys the
     * following requirement:
     * <p>
     * Suppose this list is answer = [a_1, a_2, a_3, ... , a_n], then
     * the list [|a_1 - a_2|, |a_2 - a_3|, |a_3 - a_4|, ... , |a_(n-1) - a_n|]
     * has exactly k distinct integers.
     * <p>
     * Return the list answer. If there multiple valid answers, return
     * any of them.
     *
     * @param n,k 1 <= k < n <= 10^4
     */
    int[] constructArray(int n, int k);
}
