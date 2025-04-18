/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0724_find_pivot_index;

public interface FindPivotIndex {
    /**
     * Given an array of integers nums, calculate the pivot index of
     * this array.
     * The pivot index is the index where the sum of all the numbers
     * strictly to the left of the index is equal to the sum of all the
     * numbers strictly to the index's right.
     * If the index is on the left edge of the array, then the left sum
     * is 0 because there are no elements to the left. This also applies
     * to the right edge of the array.
     * Return the leftmost pivot index. If no such index exists,
     * return -1.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -1000 <= nums[i] <= 1000
     * @return the pivot index
     */
    int pivotIndex(int[] nums);
}
