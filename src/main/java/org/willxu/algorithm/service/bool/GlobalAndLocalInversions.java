package org.willxu.algorithm.service.bool;

public interface GlobalAndLocalInversions {
    /**
     * You are given an integer array nums of length n which represents
     * a permutation of all the integers in the range [0, n - 1].
     * <p>
     * The number of global inversions is the number of the different
     * pairs (i, j) where:
     * <p>
     * - 0 <= i < j < n
     * - nums[i] > nums[j]
     * <p>
     * The number of local inversions is the number of indices i where:
     * <p>
     * - 0 <= i < n - 1
     * - nums[i] > nums[i + 1]
     * <p>
     * Return true if the number of global inversions is equal to the
     * number of local inversions.
     *
     * @param nums n == nums.length
     *             1 <= n <= 10^5
     *             0 <= nums[i] < n
     *             All the integers of nums are unique.
     *             nums is a permutation of all the numbers in the range
     *             [0, n - 1].
     */
    boolean isIdealPermutation(int[] nums);
}
