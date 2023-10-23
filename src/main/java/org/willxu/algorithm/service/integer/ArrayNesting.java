package org.willxu.algorithm.service.integer;

public interface ArrayNesting {
    /**
     * You are given an integer array nums of length n where nums is a
     * permutation of the numbers in the range [0, n - 1].
     * <p>
     * You should build a set s[k] = {nums[k], nums[nums[k]],
     * nums[nums[nums[k]]], ... } subjected to the following rule:
     * <p>
     * - The first element in s[k] starts with the selection of the
     *   element nums[k] of index = k.
     * - The next element in s[k] should be nums[nums[k]], and then
     *   nums[nums[nums[k]]], and so on.
     * - We stop adding right before a duplicate element occurs in s[k].
     * <p>
     * Return the longest length of a set s[k].
     *
     * @param nums 1 <= nums.length <= 10^5
     *             0 <= nums[i] < nums.length
     *             All the values of nums are unique.
     */
    int arrayNesting(int[] nums);
}
