/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.PositionsOfLargeGroups;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroupsLoop implements PositionsOfLargeGroups {
    @Override
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> output = new ArrayList<>();
        char[] chars = s.toCharArray();
        int lastIndex = 0;
        int diffLarge = 2;
        for (int i = 1; i < chars.length; i++) {
            boolean lastOneAndLarge =
                    i == chars.length - 1 && i - lastIndex >= diffLarge;
            if (chars[i] != chars[lastIndex]) {
                if (i - lastIndex > diffLarge) {
                    List<Integer> o = new ArrayList<>();
                    o.add(lastIndex);
                    o.add(i - 1);
                    output.add(o);
                }
                lastIndex = i;
            } else if (lastOneAndLarge) {
                List<Integer> o = new ArrayList<>();
                o.add(lastIndex);
                o.add(i);
                output.add(o);
            }
        }
        return output;
    }
}
