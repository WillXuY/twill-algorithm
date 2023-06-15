package org.willxu.algorithm.service.integer;

public interface FindTheDuplicateNumber {
    /**
     * Given an array of integers nums containing n + 1 integers where
     * each integer is in the range [1, n] inclusive.
     * <p>
     * There is only one repeated number in nums, return this repeated
     * number.
     * <p>
     * You must solve the problem without modifying the array nums and
     * uses only constant extra space.
     *
     * @param nums 1 <= n <= 10^5
     *             nums.length == n + 1
     *             1 <= nums[i] <= n
     *             All the integers in nums appear only once except for
     *             precisely one integer which appears two or more times.
     */
    int findDuplicate(int[] nums);
}
