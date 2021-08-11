/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.stringlist;

import java.util.List;

public interface SummaryRanges {
    /**
     * You are given a sorted unique integer array nums.
     *
     * Return the smallest sorted list of ranges that cover all the
     * numbers in the array exactly. That is, each element of nums is
     * covered by exactly one of the ranges, and there is no integer x
     * such that x is in one of the ranges but not in nums.
     *
     * Each range [a, b] in the list should be output as:
     * - "a->b" if a != b
     * - "a" if a == b
     *
     * @param nums 0 <= nums.length <= 20
     *             -2^31 <= nums[i] <= 2^31 - 1
     *             All the values of nums are unique.
     *             nums is sorted in ascending order.
     * @return summary ranges result.
     */
    List<String> summaryRanges(int[] nums);
}
