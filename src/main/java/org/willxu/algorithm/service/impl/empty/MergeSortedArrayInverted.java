/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.service.empty.MergeSortedArray;

public class MergeSortedArrayInverted implements MergeSortedArray {
    /**
     * Reverse replaces the positive order to avoid moving the array
     *
     * @param nums1 nums1.length == m + n
     *              -10^9 <= nums2[j] <= 10^9
     * @param m 0 <= m <= 200
     * @param nums2 -10^9 <= nums2[j] <= 10^9
     * @param n 0 <= n <= 200
     */
    @Override
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (index2 < 0) {
                return;
            } else if (index1 < 0) {
                /*
                Wrong answer 1: wen nums2 has smaller integer
                Wrong answer 2: should not copy full num2 array
                 */
                System.arraycopy(nums2, 0,
                        nums1, 0, index2 + 1);
                return;
            }
            if (nums1[index1] > nums2[index2]) {
                nums1[i] = nums1[index1];
                index1--;
            } else {
                nums1[i] = nums2[index2];
                index2--;
            }
        }
    }
}
