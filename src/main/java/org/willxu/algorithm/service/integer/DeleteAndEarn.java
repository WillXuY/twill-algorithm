package org.willxu.algorithm.service.integer;

public interface DeleteAndEarn {
    /**
     * You are given an integer array nums. You want to maximize the
     * number of points you get by performing the following operation
     * any number of times:
     * <p>
     * - Pick any nums[i] and delete it to earn nums[i] points.
     *   Afterwards, you must delete every element equal to nums[i] - 1
     *   and every element equal to nums[i] + 1.
     * <p>
     * Return the maximum number of points you can earn by applying the
     * above operation some number of times.
     *
     * @param nums 1 <= nums.length <= 2 * 10^4
     *             1 <= ums[i] <= 10^4
     */
    int deleteAndEarn(int[] nums);
}

