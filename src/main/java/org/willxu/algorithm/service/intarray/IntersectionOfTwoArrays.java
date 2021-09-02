package org.willxu.algorithm.service.intarray;

public interface IntersectionOfTwoArrays {
    /**
     * Given two integer arrays nums1 and nums2, return an array of
     * their intersection. Each element in the result must be unique and
     * you may return the result in any order.
     *
     * @param nums1 1 <= nums1.length <= 1000
     *              0 <= nums1[i] <= 1000
     * @param nums2 1 <= nums2.length <= 1000
     *              0 <= nums2[i] <= 1000
     * @return any ordered intersection of nums1 and nums2.
     */
    int[] intersection(int[] nums1, int[] nums2);
}
