package org.willxu.algorithm.service.integer;

public interface MaximumLengthOfSubarrayWithPositiveProduct {
	/**
	 * Given an array of integers nums, find the maximum length of a
	 * subarray where the product of all its elements is positive.
	 * <p>
	 * A subarray of an array is a consecutive sequence of zero or more
	 * values taken out of that array.
	 * <p>
	 * Return the maximum length of a subarray with positive product.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             -10^9 <= nums[i] <= 10^9
	 */
	int getMaxLen(int[] nums);
}
