package org.willxu.algorithm.service.integer;

public interface SmallestIndexWithEqualValue {
    /**
     * Given a 0-indexed integer array nums, return the smallest index i
     * of nums such that i mod 10 == nums[i], or -1 if such index does
     * not exist.
     * <p>
     * x mod y denotes the remainder when x is divided by y.
     *
     * @param nums 1 <= nums.length <= 100
     *             0 <= nums[i] <= 9
     */
    int smallestEqual(int[] nums);
}
