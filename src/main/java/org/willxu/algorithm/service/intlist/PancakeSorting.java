package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PancakeSorting {
    /**
     * Given an array of integers arr, sort the array by performing a
     * series of pancake flips.
     * <p>
     * In one pancake flip we do the following steps:
     * <p>
     * - Choose an integer k where 1 <= k <= arr.length.
     * - Reverse the sub-array arr[0...k-1] (0-indexed).
     * <p>
     * For example, if arr = [3,2,1,4] and we performed a pancake flip
     * choosing k = 3, we reverse the sub-array [3,2,1], so
     * arr = [1,2,3,4] after the pancake flip at k = 3.
     * <p>
     * Return an array of the k-values corresponding to a sequence of
     * pancake flips that sort arr. Any valid answer that sorts the
     * array within 10 * arr.length flips will be judged as correct.
     *
     * @param arr 1 <= arr.length <= 100
     *            1 <= arr[i] <= arr.length
     *            All integers in arr are unique (i.e. arr is a
     *            permutation of the integers from 1 to arr.length).
     */
    List<Integer> pancakeSort(int[] arr);
}
