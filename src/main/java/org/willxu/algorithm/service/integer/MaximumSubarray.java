package org.example.example.service.integer;

public interface MaximumSubarray {
    /**
     * Given an integer array nums, find the contiguous subarray
     * (containing at least one number) which has the largest sum and
     * return its sum.
     *
     * Follow up: If you have figured out the O(n) solution, try coding
     * another solution using the divide and conquer approach, which is
     * more subtle.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             -10^5 <= nums[i] <= 10^5
     * @return the contiguous subarray has the largest sum
     */
    int maxSubArray(int[] nums);
}
