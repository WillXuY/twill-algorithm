package org.willxu.algorithm.service.integer;

public interface MaximumDifferenceBetweenIncreasingElements {
    /**
     * Given a 0-indexed integer array nums of size n, find the maximum
     * difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]),
     * such that 0 <= i < j < n and nums[i] < nums[j].
     * <p>
     * Return the maximum difference. If no such i and j exists,
     * return -1.
     *
     * @param nums n == nums.length
     *             2 <= n <= 1000
     *             1 <= nums[i] <= 10^9
     */
    int maximumDifference(int[] nums);
}
