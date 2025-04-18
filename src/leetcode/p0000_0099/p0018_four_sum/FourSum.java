package org.willxu.algorithm.service.matrix;

import java.util.List;

public interface FourSum {
    /**
     * Given an array nums of n integers, return an array of all the
     * unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such
     * that:
     * <p>
     * - 0 <= a, b, c, d < n
     * - a, b, c, and d are distinct.
     * - nums[a] + nums[b] + nums[c] + nums[d] == target
     * <p>
     * You may return the answer in any order.
     *
     * @param nums 1 <= nums.length <= 200
     *             -109 <= nums[i] <= 109
     * @param target -109 <= target <= 109
     */
    List<List<Integer>> fourSum(int[] nums, int target);
}
