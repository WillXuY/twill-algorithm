package org.willxu.algorithm.service.integer;

public interface MinimumNumbersOfFunctionCallsToMakeTargetArray {
	/**
	 * You are given an integer array nums. You have an integer array
	 * arr of the same length with all values set to 0 initially. You
	 * also have the following modify function:
	 * <p>
	 * func modify(arr, op, idx){
	 *     //add by 1 index idx
	 *     if (op == 0) {
	 *         arr[idx] = arr[idx] + 1
	 *     }
	 *     //multiply by 2 all elements
	 *     if (op == 1) {
	 *         for(i = 0; i < arr.length; i++) {
	 *             arr[i] = arr[i] * 2
	 *         }
	 *     }
	 * }
	 * <p>
	 * You want to use the modify function to convert arr to nums using
	 * the minimum number of calls.
	 * <p>
	 * Return the minimum number of function calls to make nums from
	 * arr.
	 * <p>
	 * The test cases are generated so that the answer fits in a 32-bit
	 * signed integer.
	 * 
	 * @param nums 1 <= nums.length <= 10^5
	 *             0 <= nums[i] <= 10^9
	 */
	int minOperations(int[] nums);
}
