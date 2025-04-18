package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ShortestSubarrayToBeRemovedToMakeArraySorted;

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
