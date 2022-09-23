package org.willxu.algorithm.service.bool;

public interface NumberAfterDoubleReversal {
    /**
     * Reversing an integer means to reverse all its digits.
     * <p>
     * - For example, reversing 2021 gives 1202. Reversing 12300 gives
     *   321 as the leading zeros are not retained.
     * <p>
     * Given an integer num, reverse num to get reversed1, then reverse
     * reversed1 to get reversed2. Return true if reversed2 equals num.
     * Otherwise return false.
     *
     * @param num 0 <= num <= 106
     */
     boolean isSameAfterReversals(int num);
}
