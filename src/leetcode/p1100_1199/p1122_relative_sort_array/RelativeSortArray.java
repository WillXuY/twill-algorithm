package leetcode.p1100_1199.p1122_relative_sort_array;

public interface RelativeSortArray {
    /**
     * Given two arrays arr1 and arr2, the elements of arr2 are
     * distinct, and all elements in arr2 are also in arr1.
     * Sort the elements of arr1 such that the relative ordering of
     * items in arr1 are the same as in arr2. Elements that do not
     * appear in arr2 should be placed at the end of arr1 in ascending
     * order.
     *
     * @param arr1 1 <= arr1.length <= 1000
     *             0 <= arr1[i] <= 1000
     *             Each arr2[i] is in arr1.
     * @param arr2 1 <= arr2.length <= 1000
     *             0 <= arr2[i] <= 1000
     *             All the elements of arr2 are distinct.
     * @return sorted arr1 order by arr2.
     */
    int[] relativeSortArray(int[] arr1, int[] arr2);
}
