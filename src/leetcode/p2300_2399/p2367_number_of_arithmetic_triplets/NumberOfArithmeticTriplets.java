package org.willxu.algorithm.service.integer;

public interface NumberOfArithmeticTriplets {
    /**
     * You are given a 0-indexed, strictly increasing integer array nums
     * and a positive integer diff. A triplet (i, j, k) is an arithmetic
     * triplet if the following conditions are met:
     * <p>
     * - i < j < k,
     * - nums[j] - nums[i] == diff, and
     * - nums[k] - nums[j] == diff.
     * <p>
     * Return the number of unique arithmetic triplets.
     *
     * @param nums 3 <= nums.length <= 200
     *             0 <= nums[i] <= 200
     *             nums is strictly increasing.
     * @param diff 1 <= diff <= 50
     */
    int arithmeticTriplets(int[] nums, int diff);
}
