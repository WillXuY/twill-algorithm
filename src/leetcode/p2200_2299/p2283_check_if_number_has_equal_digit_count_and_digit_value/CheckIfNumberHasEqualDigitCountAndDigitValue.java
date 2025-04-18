package org.willxu.algorithm.service.bool;

public interface CheckIfNumberHasEqualDigitCountAndDigitValue {
    /**
     * You are given a 0-indexed string num of length n consisting of
     * digits.
     * <p>
     * Return true if for every index i in the range 0 <= i < n, the
     * digit i occurs num[i] times in num, otherwise return false.
     *
     * @param num n == num.length
     *            1 <= n <= 10
     *            num consists of digits.
     */
    boolean digitCount(String num);
}
