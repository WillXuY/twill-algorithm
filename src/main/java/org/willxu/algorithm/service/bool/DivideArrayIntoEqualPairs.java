package org.willxu.algorithm.service.bool;

public interface DivideArrayIntoEqualPairs {
    /**
     * You are given an integer array nums consisting of 2 * n integers.
     * <p>
     * You need to divide nums into n pairs such that:
     * <p>
     * - Each element belongs to exactly one pair.
     * - The elements present in a pair are equal.
     * <p>
     * Return true if nums can be divided into n pairs, otherwise return
     * false.
     *
     * @param nums nums.length == 2 * n
     *             1 <= n <= 500
     *             1 <= nums[i] <= 500
     */
    boolean divideArray(int[] nums);
}
