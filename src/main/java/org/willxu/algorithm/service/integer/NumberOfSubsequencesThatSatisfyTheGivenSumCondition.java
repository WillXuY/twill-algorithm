package org.willxu.algorithm.service.integer;

public interface NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
	/**
	 * You are given an array of integers nums and an integer target.
	 * <p>
	 * Return the number of non-empty subsequences of nums such that the
	 * sum of the minimum and maximum element on it is less or equal to
	 * target. Since the answer may be too large, return it modulo
	 * 10^9 + 7.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             1 <= nums[i] <= 10^6
	 * @param target 1 <= target <= 10^6
	 */
	int numSubseq(int[] nums, int target);
}
