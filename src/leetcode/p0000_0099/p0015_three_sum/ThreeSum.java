package org.willxu.algorithm.service.matrix;

import java.util.List;

public interface ThreeSum {
    /**
     * Given an integer array nums, return all the triplets
     * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
     * and nums[i] + nums[j] + nums[k] == 0.
     * <p>
     * Notice that the solution set must not contain duplicate triplets.
     *
     * @param nums 3 <= nums.length <= 3000
     *             -105 <= nums[i] <= 105
     */
    List<List<Integer>> threeSum(int[] nums);
}
