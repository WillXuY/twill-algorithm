package org.willxu.algorithm.service.integer;

public interface SortIntegersByThePowerValue {
    /**
     * The power of an integer x is defined as the number of steps
     * needed to transform x into 1 using the following steps:
     * <p>
     * - if x is even then x = x / 2
     * - if x is odd then x = 3 * x + 1
     * <p>
     * For example, the power of x = 3 is 7 because 3 needs 7 steps to
     * become 1 (3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1).
     * <p>
     * Given three integers lo, hi and k. The task is to sort all
     * integers in the interval [lo, hi] by the power value in ascending
     * order, if two or more integers have the same power value sort
     * them by ascending order.
     * <p>
     * Return the k^th integer in the range [lo, hi] sorted by the power
     * value.
     * <p>
     * Notice that for any integer x (lo <= x <= hi) it is guaranteed
     * that x will transform into 1 using these steps and that the power
     * of x is will fit in a 32-bit signed integer.
     *
     * @param lo,hi 1 <= lo <= hi <= 1000
     * @param k 1 <= k <= hi - lo + 1
     */
    int getKth(int lo, int hi, int k);
}
