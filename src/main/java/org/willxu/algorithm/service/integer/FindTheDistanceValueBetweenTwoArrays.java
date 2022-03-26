package org.willxu.algorithm.service.integer;

public interface FindTheDistanceValueBetweenTwoArrays {
    /**
     * Given two integer arrays arr1 and arr2, and the integer d, return
     * the distance value between the two arrays.
     * The distance value is defined as the number of elements arr1[i]
     * such that there is not any element arr2[j] where
     * |arr1[i] - arr2[j]| <= d
     *
     * @param arr1 1 <= arr1.length <= 500
     *             -1000 <= arr1[i] <= 1000
     * @param arr2 1 <= arr2.length <= 500
     *             -1000 <= arr2[i] <= 1000
     * @param d 0 <= d <= 1000
     * @return the distance value in arr1.
     */
    int findTheDistanceValue(int[] arr1, int[] arr2, int d);
}
