/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface BinarySearch {
    /**
     * Given an array of integers nums which is sorted in ascending
     * order, and an integer target, write a function to search target
     * in nums. If target exists, then return its index. Otherwise,
     * return -1.
     * You must write an algorithm with 0(log n) runtime complexity.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^4 < nums[i] < 10^4
     *             All the integers in nums are unique.
     *             is sorted in ascending order.
     * @param target -10^4 < target < 10^4
     * @return the index of target, or -1 means target not exit.
     */
    int search(int[] nums, int target);
}
