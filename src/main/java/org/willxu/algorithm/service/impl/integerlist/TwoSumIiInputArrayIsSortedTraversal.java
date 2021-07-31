/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integerlist;

import org.willxu.algorithm.service.integerlist.TwoSumIiInputArrayIsSorted;

public class TwoSumIiInputArrayIsSortedTraversal
        implements TwoSumIiInputArrayIsSorted {
    @Override
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length && numbers[i] <= target; i++) {
            int dif = target - numbers[i];
            for (int j = i + 1; j < numbers.length && numbers[j] <= dif; j++) {
                if (numbers[j] == dif) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[0];
    }
}
