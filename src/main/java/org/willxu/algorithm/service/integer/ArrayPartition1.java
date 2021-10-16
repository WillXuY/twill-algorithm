/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface ArrayPartition1 {
    /**
     * Given an integer array nums of 2n integers, group these integers
     * into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum
     * of min(ai, bi) for all i is maximized. Return the maximized sum.
     *
     * @param nums 2 <= nums.length <= 2 * 10^4
     *             -10^4 <= nums[i] <= 10^4
     * @return max sum of min pair.
     */
    int arrayPairSum(int[] nums);
}
