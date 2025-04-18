/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface MajorityElement {
    /**
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than
     * |_ n / 2 _| times. You may assume that the majority element
     * always exists in the array.
     *
     * @param nums 1 <= nums.length <= 5 * 10^4
     *             -2^31 <= nums[i] <= 2^31 - 1
     * @return majority element
     */
    int majorityElement(int[] nums);
}
