package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface TwoOutOfThree {
    /**
     * Given three integer arrays nums1, nums2, and nums3, return a
     * distinct array containing all the values that are present in at
     * least two out of the three arrays. You may return the values in
     * any order.
     *
     * @param nums1,nums2,nums3
     *            1 <= nums1.length, nums2.length, nums3.length <= 100
     *            1 <= nums1[i], nums2[j], nums3[k] <= 100
     */
     List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3);
}
