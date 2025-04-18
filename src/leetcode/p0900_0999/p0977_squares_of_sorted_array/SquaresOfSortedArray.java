package org.willxu.algorithm.service.ints;

public interface SquaresOfSortedArray {
    /**
     * Given an integer array nums sorted in non-decreasing order,
     * return an array of the squares of each number sorted in
     * non-decreasing order.
     * Follow up: Squaring each element and sorting the new array is
     * very trivial, could you find an O(n) solution using a different
     * approach?
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^4 <= nums[i] <= 10^4
     *             is sorted in non-decreasing order.
     * @return sorted squares of nums.
     */
    int[] sortedSquares(int[] nums);
}
