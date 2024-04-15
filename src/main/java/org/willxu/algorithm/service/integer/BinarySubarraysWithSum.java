package org.willxu.algorithm.service.integer;

public interface BinarySubarraysWithSum {
    /**
     * Given a binary array nums and an integer goal, return the number
     * of non-empty subarrays with a sum goal.
     * <p>
     * A subarray is a contiguous part of the array.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             nums[i] is either 0 or 1.
     * @param goal 0 <= goal <= nums.length
     */
    int numSubarraysWithSum(int[] nums, int goal);
}
