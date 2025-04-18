package org.willxu.algorithm.service.integer;

public interface CountSpecialQuadruplets {
    /**
     * Given a 0-indexed integer array nums, return the number of
     * distinct quadruplets (a, b, c, d) such that:
     * <p>
     * - nums[a] + nums[b] + nums[c] == nums[d], and
     * - a < b < c < d
     *
     * @param nums 4 <= nums.length <= 50
     *             1 <= nums[i] <= 100
     */
    int countQuadruplets(int[] nums);
}
