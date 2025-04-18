package org.willxu.algorithm.service.integer;

public interface FindLuckIntegerInAnArray {
    /**
     * Given an array of integers arr, a lucky integer is an integer
     * that has a frequency in the array equal to its value.
     * Return the largest lucky integer in the array. If there is no
     * lucky integer return -1.
     *
     * @param arr 1 <= arr.length <= 500
     *            1 <= arr[i] <= 500
     * @return find the largest luck number
     */
    int findLucky(int[] arr);
}
