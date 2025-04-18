package leetcode.p1500_1599.p1574_shortest_subarray_to_be_removed_to_make_array_sorted;

public class ShortestSubarrayToBeRemovedToMakeArraySortedTwoPointers
        implements ShortestSubarrayToBeRemovedToMakeArraySorted {

	@Override
	public int findLengthOfShortestSubarray(int[] arr) {
		int rightIndex = arr.length - 1;
		while (rightIndex > 0 && arr[rightIndex] >= arr[rightIndex - 1]) {
			rightIndex--;
		}
		int result = rightIndex;
		int leftIndex = 0;
		while (leftIndex < rightIndex && (leftIndex == 0 || arr[leftIndex - 1] <= arr[leftIndex])) {
			while (rightIndex < arr.length && arr[leftIndex] > arr[rightIndex]) {
				rightIndex++;
			}
			int len = rightIndex - leftIndex - 1;
			result = Math.min(len, result);
			leftIndex++;
		}
		return result;
	}

}
