/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0118_pascals_triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PascalsTriangleLevel implements PascalsTriangle {
    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> l = Collections.singletonList(1);
        r.add(l);
        if (numRows == 1) {
            return r;
        }
        l = Stream.of(1, 1).collect(Collectors.toList());
        r.add(l);
        if (numRows == 2) {
            return r;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> n = new ArrayList<>();
            n.add(1);
            for (int j = 1; j < i; j++) {
                n.add(l.get(j - 1) + l.get(j));
            }
            n.add(1);
            r.add(n);
            l = n;
        }
        return r;
    }
}
