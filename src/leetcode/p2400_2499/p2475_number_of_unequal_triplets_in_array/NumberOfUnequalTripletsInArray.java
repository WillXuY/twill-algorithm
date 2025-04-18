package org.willxu.algorithm.service.integer;

public interface NumberOfUnequalTripletsInArray {
    /**
     * You are given a 0-indexed array of positive integers nums. Find
     * the number of triplets (i, j, k) that meet the following
     * conditions:
     * <p>
     * - 0 <= i < j < k < nums.length
     * - nums[i], nums[j], and nums[k] are pairwise distinct.
     *   - In other words, nums[i] != nums[j], nums[i] != nums[k], and
     *     nums[j] != nums[k].
     * Return the number of triplets that meet the conditions.
     *
     * @param nums 3 <= nums.length <= 100
     *             1 <= nums[i] <= 1000
     */
    int unequalTriplets(int[] nums);
}
