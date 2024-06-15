package org.willxu.algorithm.service.integer;

public interface MaxConsecutiveOnesIii {
    /**
     * Given a binary array nums and an integer k, return the maximum
     * number of consecutive 1's in the array if you can flip at most k
     * 0's.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             nums[i] is either 0 or 1.
     * @param k 0 <= k <= nums.length
     */
    int longestOnes(int[] nums, int k);
}
