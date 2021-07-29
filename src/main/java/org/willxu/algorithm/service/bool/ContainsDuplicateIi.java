package org.willxu.algorithm.service.bool;

public interface ContainsDuplicateIi {
    /**
     * Given an integer array nums and an integer k, return true if
     * there are two distinct indices i and j in the array such that
     * nums[i] == nums[j] and abs(i - j) <= k.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     * @param k 0 <= k <= 10^5
     * @return contains nearby duplicate or not.
     */
    boolean containsNearbyDuplicate(int[] nums, int k);
}
