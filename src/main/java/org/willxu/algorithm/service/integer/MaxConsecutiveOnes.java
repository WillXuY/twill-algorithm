package org.willxu.algorithm.service.integer;

public interface MaxConsecutiveOnes {
    /**
     * Given a binary array nums, return the maximum number of
     * consecutive 1's in the array.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             nums[i] is either 0 or 1
     * @return the maximum number of consecutive 1.
     */
    int findMaxConsecutiveOnes(int[] nums);
}
