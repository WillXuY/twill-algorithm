package org.willxu.algorithm.service.integer;

public interface MaximumLengthOfRepeatedSubarray {
    /**
     * Given two integer arrays nums1 and nums2, return the maximum
     * length of a subarray that appears in both arrays.
     *
     * @param nums1,num2 1 <= nums1.length, nums2.length <= 1000
     *                   0 <= nums1[i], nums2[i] <= 100
     */
    int findLength(int[] nums1, int[] nums2);
}
