/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.intlist;

public interface TwoSumIiInputArrayIsSorted {
    /**
     * Given an array of integers that is already sorted in
     * non-decreasing order, find two numbers such that they add up to
     * a specific target number.
     *
     * Return the indices of the two numbers(1-indexed) as an integer
     * array answer of size 2, where
     * 1 <= answer[0] < answer[1] <= numbers.length.
     *
     * The tests are generated such that there is exactly one solution.
     * You may not use the same element twice.
     *
     * Constraints:
     * The tests are generated such that there is exactly one solution.
     *
     * @param numbers 2 <= numbers.length <= 3 * 10^4
     *                -1000 <= numbers[i] <= 1000
     *                numbers is sorted in non decreasing order.
     * @param target -1000 <= numbers[i] <= 1000
     * @return the two sum result number index+1
     */
    int[] twoSum(int[] numbers, int target);
}
