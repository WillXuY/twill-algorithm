package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface FindTheDifferenceOfTwoArrays {
    /**
     * Given two 0-indexed integer arrays nums1 and nums2, return a list
     * answer of size 2 where:
     * <p>
     * - answer[0] is a list of all distinct integers in nums1 which are
     *   not present in nums2.
     * - answer[1] is a list of all distinct integers in nums2 which are
     *   not present in nums1.
     * <p>
     * Note that the integers in the lists may be returned in any order.
     *
     * @param nums1,nums2 1 <= nums1.length, nums2.length <= 1000
     *                   -1000 <= nums1[i], nums2[i] <= 1000
     */
    List<List<Integer>> findDifference(int[] nums1, int[] nums2);
}
