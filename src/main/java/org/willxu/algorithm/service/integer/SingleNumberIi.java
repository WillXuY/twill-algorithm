package org.willxu.algorithm.service.integer;

public interface SingleNumberIi {
    /**
     * Given an integer array nums where every element appears three
     * times except for one, which appears exactly once. Find the single
     * element and return it.
     * <p>
     * You must implement a solution with a linear runtime complexity
     * and use only constant extra space.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             -2^31 <= nums[i] <= 2^31 - 1
     *             Each element in nums appears exactly three times
     *             except for one element which appears once.
     */
    int singleNumber(int[] nums);
}
