package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface Subsets {
    /**
     * Given an integer array nums of unique elements, return all
     * possible subsets (the power set).
     * <p>
     * The solution set must not contain duplicate subsets. Return the
     * solution in any order.
     *
     * @param nums 1 <= nums.length <= 10
     *             -10 <= nums[i] <= 10
     */
    List<List<Integer>> subsets(int[] nums);
}
