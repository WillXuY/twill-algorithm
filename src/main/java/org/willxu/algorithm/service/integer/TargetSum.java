package org.willxu.algorithm.service.integer;

public interface TargetSum {
    /**
     * You are given an integer array nums and an integer target.
     * <p>
     * You want to build an expression out of nums by adding one of the
     * symbols '+' and '-' before each integer in nums and then
     * concatenate all the integers.
     * <p>
     * - For example, if nums = [2, 1], you can add a '+' before 2 and a
     *   '-' before 1 and concatenate them to build the expression "+2-1".
     * <p>
     * Return the number of different expressions that you can build,
     * which evaluates to target.
     *
     * @param nums 1 <= nums.length <= 20
     *             0 <= nums[i] <= 1000
     *             0 <= sum(nums[i]) <= 1000
     * @param target -1000 <= target <= 1000
     */
    int findTargetSumWays(int[] nums, int target);
}
