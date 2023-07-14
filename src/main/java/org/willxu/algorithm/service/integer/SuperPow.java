package org.willxu.algorithm.service.integer;

public interface SuperPow {
    /**
     * Your task is to calculate a^b mod 1337 where a is a positive
     * integer and b is an extremely large positive integer given in the
     * form of an array.
     *
     * @param a 1 <= a <= 2^31 - 1
     * @param b 1 <= b.length <= 2000
     *          0 <= b[i] <= 9
     *          b does not contain leading zeros.
     */
    int superPow(int a, int[] b);
}
