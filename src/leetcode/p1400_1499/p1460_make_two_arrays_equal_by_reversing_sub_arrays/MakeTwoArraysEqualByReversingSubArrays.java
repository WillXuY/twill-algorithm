package org.willxu.algorithm.service.bool;

public interface MakeTwoArraysEqualByReversingSubArrays {
    /**
     * You are given two integer arrays of equal length target and arr.
     * In one step, you can select any non-empty sub-array of arr and
     * reverse it. You are allowed to make any number of steps.
     *
     * Return true if you can make arr equal to target or false
     * otherwise.
     *
     * @param target 1 <= target.length <= 1000
     *               1 <= target[i] <= 1000
     * @param arr target.length == arr.length
     *            1 <= arr[i] <= 1000
     * @return two arrays can be equal by reversing sub-arrays.
     */
    boolean canBeEqual(int[] target, int[] arr);
}
