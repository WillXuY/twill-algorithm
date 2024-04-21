package org.willxu.algorithm.service.integer;

public interface MinimumIncrementToMakeArrayUnique {
    /**
     * You are given an integer array nums. In one move, you can pick
     * an index i where 0 <= i < nums.length and increment nums[i] by 1.
     * <p>
     * Return the minimum number of moves to make every value in nums
     * unique.
     * <p>
     * The test cases are generated so that the answer fits in a 32-bit
     * integer.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             0 <= nums[i] <= 10^5
     */
    int minIncrementForUnique(int[] nums);
}
