package org.willxu.algorithm.service.integer;

public interface TotalHammingDistance {
    /**
     * The Hamming distance between two integers is the number of
     * positions at which the corresponding bits are different.
     * <p>
     * Given an integer array nums, return the sum of Hamming distances
     * between all the pairs of the integers in nums.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             0 <= nums[i] <= 10^9
     *             The answer for the given input will fit in a 32-bit
     *             integer.
     */
    int totalHammingDistance(int[] nums);
}
