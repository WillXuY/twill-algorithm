package org.willxu.algorithm.service.integer;

public interface MinimumMovesToEqualArrayElements {
    /**
     * Given an integer array nums of size n, return the minimum number
     * of moves required to make all array elements equal.
     * In one move, you can increment n - 1 elements of the array by 1.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     *             The answer is guaranteed to fit in a 32-bit integer.
     * @return number of steps.
     */
    int minMoves(int[] nums);
}
