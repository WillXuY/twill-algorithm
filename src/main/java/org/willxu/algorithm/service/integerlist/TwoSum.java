package org.willxu.algorithm.service.integerlist;

public interface TwoSum {
    /**
     * Given an array of integers nums and an integer target, return
     * indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution,
     * and you  may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * @param nums 2 <= nums.length <= 10^4
                   -10^9 <= nums[i] <= 10^9
     * @param target -10^9 <= target <= 10^9
     * @return Only one valid answer exists.
     */
    int[] getTwoSum(int[] nums, int target);
}
