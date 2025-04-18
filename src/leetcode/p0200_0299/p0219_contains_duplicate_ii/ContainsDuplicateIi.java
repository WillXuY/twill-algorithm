/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0219_contains_duplicate_ii;

public interface ContainsDuplicateIi {
    /**
     * Given an integer array nums and an integer k, return true if
     * there are two distinct indices i and j in the array such that
     * nums[i] == nums[j] and abs(i - j) <= k.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     * @param k 0 <= k <= 10^5
     * @return contains nearby duplicate or not.
     */
    boolean containsNearbyDuplicate(int[] nums, int k);
}
