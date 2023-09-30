package org.willxu.algorithm.service.integer;

public interface BeautifulArrangement {
    /**
     * Suppose you have n integers labeled 1 through n. A permutation of
     * those n integers perm (1-indexed) is considered a beautiful
     * arrangement if for every i (1 <= i <= n), either of the following
     * is true:
     * <p>
     * - perm[i] is divisible by i.
     * - i is divisible by perm[i].
     * <p>
     * Given an integer n, return the number of the beautiful
     * arrangements that you can construct.
     *
     * @param n 1 <= n <= 15
     */
    int countArrangement(int n);
}
