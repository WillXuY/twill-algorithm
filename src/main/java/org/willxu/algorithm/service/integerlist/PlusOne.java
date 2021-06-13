package org.willxu.algorithm.service.integerlist;

public interface PlusOne {
    /**
     * Given a non-empty array of decimal digits representing a
     * non-negative integer, increment one to the integer.
     *
     * The digits are stored such that the most significant digit is at
     * the head of the list, and each element in the array contains a
     * single digit.
     *
     * You may assume the integer does not contain any leading zero,
     * except the number 0 itself.
     *
     * @param digits 1 <= digits.length <= 100
     * @return 0 <= digits[i] <= 9
     */
    int[] plusOne(int[] digits);
}
