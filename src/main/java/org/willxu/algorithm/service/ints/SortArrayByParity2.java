package org.willxu.algorithm.service.ints;

public interface SortArrayByParity2 {
    /**
     * Given an array of integers nums, half of the integers in nums are
     * odd, and the other half are even.
     * Sort the array so that whenever nums[i] is odd, i is odd, and
     * whenever nums[i] is even, i is even.
     * Return any answer array that satisfies this condition.
     *
     * Follow Up: Could you solve it in-place?
     *
     * @param nums 2 <= nums.length <= 2 * 10^4
     *             nums.length is even.
     *             Half of the integers in nums are even.
     *             0 <= nums[i] <= 1000.
     * @return ordered nums i is odd(even) nums[i] is odd(even).
     */
    int[] sortArrayByParityII(int[] nums);
}
