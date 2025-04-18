/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface LongestHarmoniousSubsequence {
    /**
     * We define a harmonious array as an array where the difference
     * between its maximum value and its minimum value is exactly 1.
     * Given an integer array nums, return the length of its longest
     * harmonious subsequence among all its possible subsequences.
     * A subsequence of array is a sequence that can be derived from
     * the array by deleting some or no elements without changing the
     * order of the remaining elements.
     *
     * @param nums 1 <= nums.length <= 2 * 10^4
     *             -10^9 <= nums[i] <= 10^9
     * @return the longest Harmonious subsequence.
     */
    int findLHS(int[] nums);
}
