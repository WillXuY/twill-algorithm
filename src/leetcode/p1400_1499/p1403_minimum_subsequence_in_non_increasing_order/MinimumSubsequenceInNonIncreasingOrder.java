package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface MinimumSubsequenceInNonIncreasingOrder {
    /**
     * Given the array nums, obtain a subsequence of the array whose sum
     * of elements is strictly greater than the sum of the non included
     * elements in such subsequence.
     * If there are multiple solutions, return the subsequence with
     * minimum size and if there still exist multiple solutions, return
     * the subsequence with the maximum total sum of all its elements.
     * A subsequence of an array can be obtained by erasing some
     * (possibly zero) elements from the array.
     * Note that the solution with the given constraints is guaranteed
     * to be unique. Also return the answer sorted in non-increasing
     * order.
     *
     * @param nums 1 <= nums.length <= 500
     *             1 <= nums[i] <= 100
     * @return min subsequence large than remaining elements.
     */
    List<Integer> minSubsequence(int[] nums);
}
