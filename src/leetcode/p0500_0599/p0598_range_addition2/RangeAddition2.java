/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0598_range_addition2;

public interface RangeAddition2 {
    /**
     * You are given an m x n matrix M initialized with all 0's and an
     * array of operations ops, where ops[i] = [a_i, b_i] means M[x][y]
     * should be incremented by one for all 0 <= x < a_i and
     * 0 <= y < b_i.
     * Count and return the number of maximum integers in the matrix
     * after performing all the operations.
     *
     * @param m 1 <= m <= 4 * 10^4
     * @param n 1 <= n <= 4 * 10^4
     * @param ops ops[i].length = 2
     *            1 <= a_i <= m
     *            1 <= b_i <= n
     * @return the number of maximum integers in the matrix.
     */
    int maxCount(int m, int n, int[][] ops);
}
