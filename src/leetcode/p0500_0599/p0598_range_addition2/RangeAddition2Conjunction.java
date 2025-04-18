/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0598_range_addition2;

public class RangeAddition2Conjunction implements RangeAddition2 {
    @Override
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] i: ops) {
            m = Math.min(m, i[0]);
            n = Math.min(n, i[1]);
        }
        return m * n;
    }
}
