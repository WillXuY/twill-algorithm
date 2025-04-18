package leetcode.p1500_1599.p1574_shortest_subarray_to_be_removed_to_make_array_sorted;

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
