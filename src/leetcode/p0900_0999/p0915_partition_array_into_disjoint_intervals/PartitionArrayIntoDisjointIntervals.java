package org.willxu.algorithm.service.integer;

public interface PartitionArrayIntoDisjointIntervals {
    /**
     * Given an integer array nums, partition it into two (contiguous)
     * subarrays left and right so that:
     * <p>
     * - Every element in left is less than or equal to every element
     *   in right.
     * - left and right are non-empty.
     * - left has the smallest possible size.
     * <p>
     * Return the length of left after such a partitioning.
     * <p>
     * Test cases are generated such that partitioning exists.
     *
     * @param nums 2 <= nums.length <= 10^5
     *             0 <= nums[i] <= 10^6
     *             There is at least one valid answer for the given
     *             input.
     */
    int partitionDisjoint(int[] nums);
}
