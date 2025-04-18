package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface NonDecreasingSubsequences {
    /**
     * Given an integer array nums, return all the different possible
     * non-decreasing subsequences of the given array with at least two
     * elements. You may return the answer in any order.
     *
     * @param nums 1 <= nums.length <= 15
     *             -100 <= nums[i] <= 100
     */
    List<List<Integer>> findSubsequences(int[] nums);
}
