package org.willxu.algorithm.service.ints;

public interface AdvantageShuffle {
    /**
     * You are given two integer arrays nums1 and nums2 both of the same
     * length. The advantage of nums1 with respect to nums2 is the
     * number of indices i for which nums1[i] > nums2[i].
     * <p>
     * Return any permutation of nums1 that maximizes its advantage with
     * respect to nums2.
     *
     * @param nums1 1 <= nums1.length <= 10^5
     * @param nums2 nums2.length == nums1.length
     *              0 <= nums1[i], nums2[i] <= 10^9
     */
    int[] advantageCount(int[] nums1, int[] nums2);
}
