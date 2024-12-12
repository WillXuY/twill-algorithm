package org.willxu.algorithm.service.integer;

public interface FourDivisors {
    /**
     * Given an integer array nums, return the sum of divisors of the
     * integers in that array that have exactly four divisors. If there
     * is no such integer in the array, return 0.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             1 <= nums[i] <= 10^5
     */
    int sumFourDivisors(int[] nums);
}
