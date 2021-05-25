package org.willxu.algorithm.service.integerarray2integer;

public interface MinimumSizeSubarraySumService {
    /**
     * https://leetcode.com/problems/minimum-size-subarray-sum/
     * 209. Minimum Size Subarray Sum
     *
     * Given an array of n positive integers and a positive integer s, find the
     * minimal length of a contiguous subarray of which the sum >= s. If there
     * isn't one, return 0 instead.
     */
    int getMinimumSizeSubarraySum(int s, int[] nums);
}
