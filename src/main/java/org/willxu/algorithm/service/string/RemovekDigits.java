package org.willxu.algorithm.service.string;

public interface RemovekDigits {
    /**
     * Given string num representing a non-negative integer num, and an
     * integer k, return the smallest possible integer after removing k
     * digits from num.
     *
     * @param num,k 1 <= k <= num.length <= 10^5
     *              num consists of only digits.
     *              num does not have any leading zeros except for the
     *              zero itself.
     */
    String removeKdigits(String num, int k);
}
