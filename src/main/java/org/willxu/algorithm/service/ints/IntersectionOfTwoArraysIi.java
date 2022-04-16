package org.willxu.algorithm.service.ints;

public interface IntersectionOfTwoArraysIi {
    /**
     * Given two integer arrays nums1 and nums2, return an array of
     * their intersection. Each element in the result must appear as
     * many times as it shows in both arrays and you may return the
     * result in any order.
     *
     * Follow up:
     * - What if the given array is already sorted? How would you
     *   optimize your algorithm?
     * - What if nums1's size is small compared to nums2's size? Which
     *   algorithm is better?
     * - What if elements of nums2 are stored on disk, and the memory is
     *   limited such that you cannot load all elements into the memory
     *   at once?
     *
     * @param nums1 1 <= nums1.length <= 1000
     *              0 <= nums1[i] <= 1000
     * @param nums2 1 <= nums2.length <= 1000
     *              0 <= nums2[i] <= 1000
     * @return any ordered intersection of nums1 and nums2.
     */
    int[] intersect(int[] nums1, int[] nums2);
}
