/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.DistributeCandies;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandiesGroup implements DistributeCandies {
    @Override
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i: candyType) {
            set.add(i);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
