package org.willxu.algorithm.service.integer;

public interface MaximumNumberOfNonOverlappingSubarrayWithSumEqualsTarget {
	/**
	 * Given an array nums and an integer target, return the maximum
	 * number of non-empty non-overlapping subarrays such that the sum
	 * of values in each subarray is equal to target.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             -10^4 <= nums[i] <= 10^4
	 * @param target 0 <= target <= 10^6
	 */
	int maxNonOverlapping(int[] nums, int target);
}
