package org.willxu.algorithm.service.bool;

public interface CanMakeArithmeticProgressionFromSequence {
    /**
     * A sequence of numbers is called an arithmetic progression if the
     * difference between any two consecutive elements is the same.
     *
     * Given an array of numbers arr, return true if the array can be
     * rearranged to form an arithmetic progression. Otherwise, return
     * false.
     *
     * @param arr 2 <= arr.length <= 1000
     *            -106 <= arr[i] <= 106
     */
    boolean canMakeArithmeticProgression(int[] arr);
}
