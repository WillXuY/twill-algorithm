package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface LargestDivisibleSubset {
    /**
     * Given a set of distinct positive integers nums, return the
     * largest subset answer such that every pair (answer[i], answer[j])
     * of elements in this subset satisfies:
     * <p>
     * - answer[i] % answer[j] == 0, or
     * - answer[j] % answer[i] == 0
     * <p>
     * If there are multiple solutions, return any of them.
     *
     * @param nums 1 <= nums.length <= 1000
     *             1 <= nums[i] <= 2 * 10^9
     *             All the integers in nums are unique.
     */
    List<Integer> largestDivisibleSubset(int[] nums);
}
