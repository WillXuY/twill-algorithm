package org.willxu.algorithm.service.string;

public interface KthDistinctStringInAnArray {
    /**
     * A distinct string is a string that is present only once in an
     * array.
     * <p>
     * Given an array of strings arr, and an integer k, return the kth
     * distinct string present in arr. If there are fewer than k
     * distinct strings, return an empty string "".
     * <p>
     * Note that the strings are considered in the order in which they
     * appear in the array.
     *
     * @param arr,k 1 <= k <= arr.length <= 1000
     *              1 <= arr[i].length <= 5
     *              arr[i] consists of lowercase English letters.
     */
    String kthDistinct(String[] arr, int k);
}
