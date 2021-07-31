/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface RemoveElement {
    /**
     * Given an array nums and a value val, remove all instances of
     * that value in-place and return the new length.
     * Do not allocate extra space for another array. you must do this
     * by modifying the input array in-place with O(1) extra memory.
     * The order of elements can be changed. It doesn't matter what you
     * leave beyond the new length.
     * Clarification:
     * Confused why the returned value is an integer but your answer is
     * an array?
     * Note that the input array is passed in by reference, which means
     * a modification to the input array will be known to the caller as
     * well.
     * @param nums 0 <= nums.length <= 100
     *             0 <= nums[i] <= 50
     * @param val 0 <= val <= 100
     * @return result array length to split the deal input array.
     */
    int removeElement(int[] nums, int val);
}
