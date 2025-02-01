package org.willxu.algorithm.service.integer;

public interface MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
	/**
	 * You are given an integer array nums.
	 * <p>
	 * In one move, you can choose one element of nums and change it to
	 * any value.
	 * <p>
	 * Return the minimum difference between the largest and smallest
	 * value of nums after performing at most three moves.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             -10^9 <= nums[i] <= 10^9
	 */
	int minDifference(int[] nums);
}
