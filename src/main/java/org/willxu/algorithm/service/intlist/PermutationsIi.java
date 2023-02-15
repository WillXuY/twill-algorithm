package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PermutationsIi {
    /**
     * Given a collection of numbers, nums, that might contain
     * duplicates, return all possible unique permutations in any order.
     *
     * @param nums 1 <= nums.length <= 8
     *             -10 <= nums[i] <= 10
     */
    List<List<Integer>> permuteUnique(int[] nums);
}
