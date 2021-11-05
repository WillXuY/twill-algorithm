/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumProductOfThreeNumbers;

public class MaximumProductOfThreeNumbersClassify
        implements MaximumProductOfThreeNumbers {
    @Override
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        int[] positive = new int[3];
        int[] negativeMax = new int[2];
        boolean noPositive = true;
        int[] negativeMin = new int[3];
        for (int i: nums) {
            if (i >= 0) {
                noPositive = false;
                if (i > positive[2]) {
                    positive[0] = positive[1];
                    positive[1] = positive[2];
                    positive[2] = i;
                } else if (i > positive[1]) {
                    positive[0] = positive[1];
                    positive[1] = i;
                } else if (i > positive[0]) {
                    positive[0] = i;
                }
            } else {
                if (i < negativeMax[1]) {
                    negativeMax[0] = negativeMax[1];
                    negativeMax[1] = i;
                } else if (i < negativeMax[0]){
                    negativeMax[0] = i;
                }
                if (negativeMin[2] == 0 || i > negativeMin[2]) {
                    negativeMin[0] = negativeMin[1];
                    negativeMin[1] = negativeMin[2];
                    negativeMin[2] = i;
                } else if (negativeMin[1] == 0 || i > negativeMin[1]) {
                    negativeMin[0] = negativeMin[1];
                    negativeMin[1] = i;
                } else if (negativeMin[0] == 0 || i > negativeMin[0]) {
                    negativeMin[0] = i;
                }
            }
        }
        if (noPositive) {
            return negativeMin[0] * negativeMin[1] * negativeMin[2];
        }
        int productPositive = positive[0] * positive[1] * positive[2];
        if (negativeMax[0] == 0) {
            return productPositive;
        }
        int productNegativeMax = negativeMax[0] * negativeMax[1] * positive[2];
        return Math.max(productNegativeMax, productPositive);
    }
}
