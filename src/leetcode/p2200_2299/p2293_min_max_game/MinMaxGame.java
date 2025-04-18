package org.willxu.algorithm.service.integer;

public interface MinMaxGame {
    /**
     * You are given a 0-indexed integer array nums whose length is a
     * power of 2.
     * <p>
     * Apply the following algorithm on nums:
     * <p>
     * - Let n be the length of nums. If n == 1, end the process.
     *   Otherwise, create a new 0-indexed integer array newNums of
     *   length n / 2.
     * - For every even index i where 0 <= i < n / 2, assign the value
     *   of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
     * - For every odd index i where 0 <= i < n / 2, assign the value of
     *   newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
     * - Replace the array nums with newNums.
     * - Repeat the entire process starting from step 1.
     * <p>
     * Return the last number that remains in nums after applying the algorithm.
     *
     * @param nums 1 <= nums.length <= 1024
     *             1 <= nums[i] <= 109
     *             nums.length is a power of 2.
     */
    int minMaxGame(int[] nums);
}
