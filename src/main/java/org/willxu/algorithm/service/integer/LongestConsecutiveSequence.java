package org.willxu.algorithm.service.integer;

public interface LongestConsecutiveSequence {
    /**
     * Given an unsorted array of integers nums, return the length of
     * the longest consecutive elements sequence.
     * <p>
     * You must write an algorithm that runs in O(n) time.
     *
     * @param nums 0 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     */
    int longestConsecutive(int[] nums);
}
