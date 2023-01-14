package org.willxu.algorithm.service.integer;

public interface ThreeSumClosest {
    /**
     * Given an integer array nums of length n and an integer target,
     * find three integers in nums such that the sum is closest to target
     * <p>
     * Return the sum of the three integers.
     * <p>
     * You may assume that each input would have exactly one solution.
     *
     * @param nums 3 <= nums.length <= 500
     *             -1000 <= nums[i] <= 1000
     * @param target -104 <= target <= 104
     */
    int threeSumClosest(int[] nums, int target);
}
