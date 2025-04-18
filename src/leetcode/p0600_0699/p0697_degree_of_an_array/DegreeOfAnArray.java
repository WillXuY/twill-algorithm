/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0697_degree_of_an_array;

public interface DegreeOfAnArray {
    /**
     * Given a non-empty array of non-negative integers nums, the degree
     * of this array is defined as the maximum frequency of any one of
     * its elements.
     * Your task is to find the smallest possible length of a
     * (contiguous) subarray of nums, that has the same degree as nums.
     *
     * @param nums 1 <= nums.length <= 50000
     *             0 <= nums[i] <= 49999
     * @return find the shortest sub array's length.
     */
    int findShortestSubArray(int[] nums);
}
