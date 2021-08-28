package org.willxu.algorithm.service.bool;

public interface PowerOfThree {
    /**
     * Given an integer n, return true if it is a power of there.
     * Otherwise, return false.
     * An integer n is a power of three, if there exists an integer such
     * that n == 3^x.
     *
     * Follow up:
     * Could you solve it without loops/recursion?
     *
     * @param n -2^31 <= n <= 2^31 - 1
     * @return is power of three or not.
     */
    boolean isPowerOfThree(int n);
}
