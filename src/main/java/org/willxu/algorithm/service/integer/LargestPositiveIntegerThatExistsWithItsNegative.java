package org.willxu.algorithm.service.integer;

public interface LargestPositiveIntegerThatExistsWithItsNegative {
    /**
     * Given an integer array nums that does not contain any zeros,
     * find the largest positive integer k such that -k also exists in
     * the array.
     * <p>
     * Return the positive integer k. If there is no such integer,
     * return -1.
     *
     * @param nums 1 <= nums.length <= 1000
     *             -1000 <= nums[i] <= 1000
     *             nums[i] != 0
     */
    int findMaxK(int[] nums);
}
