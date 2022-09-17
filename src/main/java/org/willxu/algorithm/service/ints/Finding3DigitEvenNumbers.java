package org.willxu.algorithm.service.ints;

public interface Finding3DigitEvenNumbers {
    /**
     * You are given an integer array digits, where each element is a
     * digit. The array may contain duplicates.
     * <p>
     * You need to find all the unique integers that follow the given
     * requirements:
     * <p>
     * - The integer consists of the concatenation of three elements
     *   from digits in any arbitrary order.
     * - The integer does not have leading zeros.
     * - The integer is even.
     * <p>
     * For example, if the given digits were [1, 2, 3], integers 132 and
     * 312 follow the requirements.
     * <p>
     * Return a sorted array of the unique integers.
     * <p>
     *
     * @param digits 3 <= digits.length <= 100
     *               0 <= digits[i] <= 9
     */
    int[] findEvenNumbers(int[] digits);
}
