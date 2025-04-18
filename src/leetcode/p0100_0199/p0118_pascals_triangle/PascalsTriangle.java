/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0118_pascals_triangle;

import java.util.List;

public interface PascalsTriangle {
    /**
     * Given an integer numRows, return the first numRows of Pascal's
     * triangle.
     *
     * In Pascals triangle, each number is the sum of the two numbers
     * directly above it as shown:
     *
     * @param numRows 1 <= numRows <= 30
     * @return Pascal's Triangle
     */
    List<List<Integer>> generate(int numRows);
}
