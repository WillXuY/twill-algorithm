package org.willxu.algorithm.service.integer;

public interface ReduceArraySizeToTheHalf {
    /**
     * You are given an integer array arr. You can choose a set of
     * integers and remove all the occurrences of these integers in the
     * array.
     * <p>
     * Return the minimum size of the set so that at least half of the
     * integers of the array are removed.
     *
     * @param arr 2 <= arr.length <= 10^5
     *            arr.length is even.
     *            1 <= arr[i] <= 10^5
     */
    int minSetSize(int[] arr);
}
