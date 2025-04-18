/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface ContainsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at
     * least twice in the array, and return false if every element is
     * distinct.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     * @return contains duplicate or not
     */
    boolean containsDuplicate(int[] nums);
}
