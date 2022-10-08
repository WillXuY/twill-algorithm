package org.willxu.algorithm.service.integer;

public interface MostFrequentNumberFollowingKeyInAnArray {
    /**
     * You are given a 0-indexed integer array nums. You are also given
     * an integer key, which is present in nums.
     * <p>
     * For every unique integer target in nums, count the number of
     * times target immediately follows an occurrence of key in nums. In
     * other words, count the number of indices i such that:
     * <p>
     * - 0 <= i <= nums.length - 2,
     * - nums[i] == key and,
     * - nums[i + 1] == target.
     * <p>
     * Return the target with the maximum count. The test cases will be
     * generated such that the target with maximum count is unique.
     *
     * @param nums 2 <= nums.length <= 1000
     *             1 <= nums[i] <= 1000
     */
    int mostFrequent(int[] nums, int key);
}
