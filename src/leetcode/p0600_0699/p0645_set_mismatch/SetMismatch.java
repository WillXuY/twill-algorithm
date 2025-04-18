/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.ints;

public interface SetMismatch {
    /**
     * You have a set of integers s, which originally contains all the
     * numbers from 1 to n. Unfortunately, due to some error, one of the
     * numbers in s got duplicated to another number in the set, which
     * results in repetition of one number and loss of another number.
     * You are given an integer array nums representing the data status
     * of this set after the error.
     * Find the number that occurs twice and the number that is missing
     * and return them in the form of an array.
     *
     * @param nums 2 <= nums.length <= 10^4
     *             1 <= nums[i] <= 10^4
     * @return the error number and the lost number.
     */
    int[] findErrorNums(int[] nums);
}
