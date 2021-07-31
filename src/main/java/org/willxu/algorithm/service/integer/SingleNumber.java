/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface SingleNumber {
    /**
     * Given a non-empty array of integers nums, every element appears
     * twice except for one. Find that single one.
     *
     * You must implement a solution with a linear runtime complexity
     * and use only constant extra space.
     *
     * Constraints:
     * Each element in the array appears twice except for one element
     * which appears only once.
     *
     * @param nums 1 <= nums.length <= 3 * 10^4
     *             -3 * 10^4 <= nums[i] <= 3 * 10^4
     * @return value of the single number
     */
    int singleNumber(int[] nums);
}
