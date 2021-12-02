/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface LargestNumberAtLeastTwiceOfOthers {
    /**
     * You are given an integer array nums where the largest integer is
     * unique.
     * Determine whether the largest element in the array is at least
     * twice as much as every other number in the array. If it is,
     * return the index of the largest element, or return -1 otherwise.
     *
     * @param nums 1 <= nums.length <= 50
     *             0 <= nums[i] <= 100
     *             The largest element in nums is unique.
     * @return the largest number's index.
     */
    int dominantIndex(int[] nums);
}
