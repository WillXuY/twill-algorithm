package org.willxu.algorithm.service.ints;

public interface ReplaceElementsWithGreatestElementOnRightSide {
    /**
     * Given an array arr, replace every element in that array with the
     * greatest element among the elements to its right, and replace the
     * last element with -1.
     * After doing so, return the array.
     *
     * @param arr 1 <= arr.length <= 10^4
     *            1 <= arr[i] <= 10^5
     * @return replace every element in arr with the greatest element
     *         among the elements to its right, and replace the last
     *         element with -1.
     */
    int[] replaceElements(int[] arr);
}
