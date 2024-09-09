package org.willxu.algorithm.service.integer;

public interface DecreaseElementsToMakeArrayZigzag {
    /**
     * Given an array nums of integers, a move consists of choosing any
     * element and decreasing it by 1.
     * <p>
     * An array A is a zigzag array if either:
     * <p>
     * - Every even-indexed element is greater than adjacent elements,
     *   ie. A[0] > A[1] < A[2] > A[3] < A[4] > ...
     * - OR, every odd-indexed element is greater than adjacent
     *   elements, ie. A[0] < A[1] > A[2] < A[3] > A[4] < ...
     * <p>
     * Return the minimum number of moves to transform the given array
     * nums into a zigzag array.
     *
     * @param nums 1 <= nums.length <= 1000
     *             1 <= nums[i] <= 1000
     */
    int movesToMakeZigzag(int[] nums);
}
