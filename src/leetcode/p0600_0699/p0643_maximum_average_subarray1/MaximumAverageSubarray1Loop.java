/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.doublepoint;

import org.willxu.algorithm.service.doublepoint.MaximumAverageSubarray1;

public class MaximumAverageSubarray1Loop
        implements MaximumAverageSubarray1 {
    @Override
    public double findMaxAverage(int[] nums, int k) {
        double output = 0;
        double count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                count += nums[i];
                if (i == k - 1) {
                    output = count;
                }
            } else {
                count = count + nums[i] - nums[i - k];
                if (count > output) {
                    output = count;
                }
            }
        }
        return output / k;
    }
}
