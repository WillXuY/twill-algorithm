package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface LexicographicalNumbers {
    /**
     * Given an integer n, return all the numbers in the range [1, n]
     * sorted in lexicographical order.
     * <p>
     * You must write an algorithm that runs in O(n) time and uses O(1)
     * extra space.
     *
     * @param n 1 <= n <= 5 * 10^4
     */
    List<Integer> lexicalOrder(int n);
}
