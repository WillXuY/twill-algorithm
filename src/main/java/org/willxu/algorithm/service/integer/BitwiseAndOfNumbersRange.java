package org.willxu.algorithm.service.integer;

public interface BitwiseAndOfNumbersRange {
    /**
     * Given two integers left and right that represent the range
     * [left, right], return the bitwise AND of all numbers in this
     * range, inclusive.
     *
     * @param left,right 0 <= left <= right <= 2^31 - 1
     */
    int rangeBitwiseAnd(int left, int right);
}
