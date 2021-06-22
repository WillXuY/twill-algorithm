package org.willxu.algorithm.service.empty;

public interface MergeSortedArray {
    /**
     * You are given two integer arrays nums1 and nums2, sorted in
     * non-decreasing order, and two integers m and n, representing
     * the number of elements in nums1 and nums2 respectively.
     *
     * Merge nums1 and nums2 into a single array sorted in
     * non-decreasing order.
     *
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1. To accommodate
     * this, nums1 has a length of m + n, where the first m elements
     * denote the elements that should be merged, and the last n
     * elements are set to 0 and should be ignored. nums2 has a length
     * of n.
     *
     * Constraints:
     * 1 <= m + n <= 200
     *
     * Follow up:
     * Can you come up with an algorithm that runs in O(m + n) time?
     *
     * @param nums1 nums1.length == m + n
     *              -10^9 <= nums2[j] <= 10^9
     * @param m 0 <= m <= 200
     * @param nums2 -10^9 <= nums2[j] <= 10^9
     * @param n 0 <= n <= 200
     */
    void merge(int[] nums1, int m, int[] nums2, int n);
}
