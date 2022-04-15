package org.willxu.algorithm.service.bool;

public interface CheckIfAllOnesAreAtLeastLengthPlacesAway {
    /**
     * Given an binary array nums and an integer k, return true if all
     * 1's are at least k places away from each other, otherwise return
     * false.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             nums[i] is 0 or 1
     * @param k 0 <= k <= nums.length
     * @return all 1's are at least k places away from each other
     */
    boolean kLengthApart(int[] nums, int k);
}
