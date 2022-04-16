/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PascalsTriangleIi {
    /**
     * Given an integer rowIndex, return the rowIndex^th (0-indexed)
     * row of the Pascal's triangle.
     *
     * In Pascal's triangle, eac number is the sum of the two numbers
     * directly above it as shown:
     *
     * @param rowIndex 0 <= rowIndex <= 33
     * @return row with index in Pascal's triangle
     */
    List<Integer> getRow(int rowIndex);
}
