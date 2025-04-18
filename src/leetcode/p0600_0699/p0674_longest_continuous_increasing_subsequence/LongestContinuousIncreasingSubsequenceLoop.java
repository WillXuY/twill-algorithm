/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LongestContinuousIncreasingSubsequence;

public class LongestContinuousIncreasingSubsequenceLoop
        implements LongestContinuousIncreasingSubsequence {
    @Override
    public int findLengthOfLCIS(int[] nums) {
        int output = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 0) {
                count++;
            } else {
                count = 1;
            }
            output = Math.max(output, count);
        }
        return output;
    }
}
