package org.willxu.algorithm.service.integer;

public interface LongestArithmeticSubsequenceOfGivenDifference {
    /**
     * Given an integer array arr and an integer difference, return the
     * length of the longest subsequence in arr which is an arithmetic
     * sequence such that the difference between adjacent elements in
     * the subsequence equals difference.
     * <p>
     * A subsequence is a sequence that can be derived from arr by
     * deleting some or no elements without changing the order of the
     * remaining elements.
     *
     * @param arr 1 <= arr.length <= 10^5
     * @param difference -10^4 <= arr[i], difference <= 10^4
     */
    int longestSubsequence(int[] arr, int difference);
}
