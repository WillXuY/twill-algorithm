package org.willxu.algorithm.service.integer;

public interface FindGreatestCommonDivisorOfArray {
    /**
     * Given an integer array nums, return the greatest common divisor
     * of the smallest number and largest number in nums.
     * <p>
     * The greatest common divisor of two numbers is the largest
     * positive integer that evenly divides both numbers.
     *
     * @param nums 2 <= nums.length <= 1000
     *             1 <= nums[i] <= 1000
     */
    int findGCD(int[] nums);
}
