/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface PeakIndexInMountainArray {
    /**
     * Let's call an array arr a mountain if the following properties
     * hold:
     * - arr.length >= 3
     * - There exists some i with 0 < i < arr.length - 1 such that:
     *   - arr[0] < arr[1] < ... arr[i - 1] < arr[i]
     *   - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     * Given an integer array arr that is guaranteed to be a mountain,
     * return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i]
     * > arr[i + 1] > ... > arr[arr.length - 1].
     * Follow up: Finding the O(n) is straightforward, could you find an
     * O(log(n)) solution?
     *
     * @param arr 3 <= arr.length <= 10^4
     *            0 <= arr[i] <= 10^6
     *            is guaranteed to be a mountain array.
     * @return the index of top.
     */
    int peakIndexInMountainArray(int[] arr);
}
