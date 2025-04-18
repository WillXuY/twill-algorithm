/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface MaximumProductOfThreeNumbers {
    /**
     * Given an integer array nums, find three numbers whose product is
     * maximum and return the maximum product.
     *
     * @param nums 3 <= nums.length <= 10^4
     *             -1000 <= nums[i] <= 1000
     * @return the maximum product.
     */
    int maximumProduct(int[] nums);
}
