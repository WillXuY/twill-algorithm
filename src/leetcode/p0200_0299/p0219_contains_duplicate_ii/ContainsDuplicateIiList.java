/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import leetcode.p0200_0299.p0219_contains_duplicate_ii.ContainsDuplicateIi;

import java.util.ArrayList;

public class ContainsDuplicateIiList implements ContainsDuplicateIi {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return true;
            }
            list.add(num);
            if (list.size() > k) {
                list.remove(0);
            }
        }
        return false;
    }
}
