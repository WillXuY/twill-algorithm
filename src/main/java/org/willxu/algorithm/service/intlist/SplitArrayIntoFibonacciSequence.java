package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface SplitArrayIntoFibonacciSequence {
    /**
     * You are given a string of digits num, such as "123456579". We can
     * split it into a Fibonacci-like sequence [123, 456, 579].
     * <p>
     * Formally, a Fibonacci-like sequence is a list f of non-negative
     * integers such that:
     * <p>
     * - 0 <= f[i] < 2^31, (that is, each integer fits in a 32-bit
     *   signed integer type),
     * - f.length >= 3, and
     * - f[i] + f[i + 1] == f[i + 2] for all 0 <= i < f.length - 2.
     * <p>
     * Note that when splitting the string into pieces, each piece must
     * not have extra leading zeroes, except if the piece is the number
     * 0 itself.
     * <p>
     * Return any Fibonacci-like sequence split from num, or return []
     * if it cannot be done.
     *
     * @param num 1 <= num.length <= 200
     *            num contains only digits.
     */
    List<Integer> splitIntoFibonacci(String num);
}
