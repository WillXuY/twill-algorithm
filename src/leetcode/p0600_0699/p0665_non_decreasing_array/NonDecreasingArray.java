package org.willxu.algorithm.service.bool;

public interface NonDecreasingArray {
    /**
     * Given an array nums with n integers, your task is to check if it
     * could become non-decreasing by modifying at most one element.
     * <p>
     * We define an array is non-decreasing if nums[i] <= nums[i + 1]
     * holds for every i (0-based) such that (0 <= i <= n - 2).
     *
     * @param nums n == nums.length
     *             1 <= n <= 10^4
     *             -10^5 <= nums[i] <= 10^5
     */
    boolean checkPossibility(int[] nums);
}
