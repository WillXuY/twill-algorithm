package org.willxu.algorithm.service.integer;

public interface CombinationSumIv {
    /**
     * Given an array of distinct integers nums and a target integer
     * target, return the number of possible combinations that add up to
     * target.
     * <p>
     * The test cases are generated so that the answer can fit in a
     * 32-bit integer.
     *
     * @param nums 1 <= nums.length <= 200
     *             1 <= nums[i] <= 1000
     *             All the elements of nums are unique.
     * @param target 1 <= target <= 1000
     */
    int combinationSum4(int[] nums, int target);
}
