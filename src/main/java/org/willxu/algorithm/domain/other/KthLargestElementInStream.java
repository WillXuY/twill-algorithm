/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.domain.other;

public abstract class KthLargestElementInStream {
    /**
     * Initializes the object with the integer k and the stream of
     * integers nums.
     * It is guaranteed that there will be at least k elements in the
     * array when you search for the k^th element.
     *
     * @param k 1 <= k <= 10^4
     * @param nums 0 <= nums.length <= 10^4
     *             -10^4 <= nums[i] <= 10^4
     */
    public KthLargestElementInStream(int k, int[] nums) {}

    /**
     * Appends the integer val to the stream and returns the element
     * representing the k^th largest element in the stream.
     * Note that it is the k^the largest element in the sorted order,
     * not the k^th distinct element.
     *
     * @param val -10^4 <= val <= 10^4
     * @return the k^th element.
     */
    public abstract int add(int val);
}
