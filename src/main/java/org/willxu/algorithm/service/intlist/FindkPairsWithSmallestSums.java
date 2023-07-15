package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface FindkPairsWithSmallestSums {
    /**
     * You are given two integer arrays nums1 and nums2 sorted in
     * non-decreasing order and an integer k.
     * <p>
     * Define a pair (u, v) which consists of one element from the first
     * array and one element from the second array.
     * <p>
     * Return the k pairs (u_1, v_1), (u_2, v_2), ..., (u_k, v_k) with
     * the smallest sums.
     *
     * @param nums1,num2 1 <= nums1.length, nums2.length <= 10^5
     *                   -10^9 <= nums1[i], nums2[i] <= 10^9
     *                   nums1 and nums2 both are sorted in
     *                   non-decreasing order.
     * @param k 1 <= k <= 10^4
     */
    List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k);
}
