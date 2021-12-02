/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LargestNumberAtLeastTwiceOfOthers;

public class LargestNumberAtLeastTwiceOfOthersLoop
        implements LargestNumberAtLeastTwiceOfOthers {
    @Override
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int secondIndex = -1;
        for (int i = 1; i < nums.length; i++) {
            if (secondIndex == -1) {
                if (nums[i] > nums[maxIndex]) {
                    secondIndex = maxIndex;
                    maxIndex = i;
                } else if (nums[i] < nums[maxIndex]) {
                    secondIndex = i;
                }
            } else {
                if (nums[i] > nums[maxIndex]) {
                    secondIndex = maxIndex;
                    maxIndex = i;
                } else if (nums[i] > nums[secondIndex]) {
                    secondIndex = i;
                }
            }
        }
        if (secondIndex == -1 || nums[maxIndex] >= nums[secondIndex] * 2) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}
