package leetcode.p1200_1299.p1287_element_appearing_more_than25p_in_sorted_array;

public interface ElementAppearingMoreThan25pInSortedArray {
    /**
     * Given an integer array sorted in non-decreasing order, there is
     * exactly one integer in the array that occurs more than 25% of the
     * time, return that integer.
     *
     * @param arr 1 <= arr.length <= 10^4
     *            0 <= arr[i] <= 10^5
     * @return the integer appearing more than 25% in sorted array arr.
     */
    int findSpecialInteger(int[] arr);
}
