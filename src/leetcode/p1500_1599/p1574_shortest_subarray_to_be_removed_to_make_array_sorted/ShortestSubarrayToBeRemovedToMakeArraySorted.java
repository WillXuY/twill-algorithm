package org.willxu.algorithm.service.integer;

public interface ShortestSubarrayToBeRemovedToMakeArraySorted {
	/**
	 * Given an integer array arr, remove a subarray (can be empty)
	 * from arr such that the remaining elements in arr are
	 * non-decreasing.
	 * <p>
	 * Return the length of the shortest subarray to remove.
	 * <p>
	 * A subarray is a contiguous subsequence of the array.
	 * 
	 * @param arr 1 <= arr.length <= 10^5
	 *            0 <= arr[i] <= 10^9
	 */
	int findLengthOfShortestSubarray(int[] arr);
}
