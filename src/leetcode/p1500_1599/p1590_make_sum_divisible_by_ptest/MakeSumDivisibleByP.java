package leetcode.p1500_1599.p1590_make_sum_divisible_by_ptest;

public interface MakeSumDivisibleByP {
	/**
	 * Given an array of positive integers nums, remove the smallest
	 * subarray (possibly empty) such that the sum of the remaining
	 * elements is divisible by p. It is not allowed to remove the whole
	 * array.
	 * <p>
	 * Return the length of the smallest subarray that you need to
	 * remove, or -1 if it's impossible.
	 * <p>
	 * A subarray is defined as a contiguous block of elements in the
	 * array.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             1 <= nums[i] <= 10^9
	 * @param p 1 <= p <= 10^9
	 */
	int minSubarray(int[] nums, int p);
}
