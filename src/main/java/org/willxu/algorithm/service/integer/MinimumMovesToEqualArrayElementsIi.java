package org.willxu.algorithm.service.integer;

public interface MinimumMovesToEqualArrayElementsIi {
    /**
     * Given an integer array nums of size n, return the minimum number
     * of moves required to make all array elements equal.
     * <p>
     * In one move, you can increment or decrement an element of the
     * array by 1.
     * <p>
     * Test cases are designed so that the answer will fit in a 32-bit
     * integer.
     *
     * @param nums n == nums.length
     *             1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     */
    int minMoves2(int[] nums);
}
