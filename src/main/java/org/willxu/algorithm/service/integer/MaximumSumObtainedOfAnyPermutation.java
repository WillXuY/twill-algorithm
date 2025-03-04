package org.willxu.algorithm.service.integer;

public interface MaximumSumObtainedOfAnyPermutation {
	/**
	 * We have an array of integers, nums, and an array of requests
	 * where requests[i] = [start_i, end_i]. The i^th request asks for
	 * the sum of nums[start_i] + nums[start_i + 1] + ...
	 * + num_s[end_i - 1] + nums[end_i]. Both start_i and end_i are
	 * 0-indexed.
	 * <p>
	 * Return the maximum total sum of all requests among all
	 * permutations of nums.
	 * <p>
	 * Since the answer may be too large, return it modulo 10^9 + 7.
	 * 
	 * @param nums n == nums.length
	 *             1 <= n <= 10^5
	 *             0 <= nums[i] <= 10^5
	 * @param requests 1 <= requests.length <= 10^5
	 *                 requests[i].length == 2
	 *                 0 <= start_i <= end_i < n
	 */
	int maxSumRangeQuery(int[] nums, int[][] requests);
}
