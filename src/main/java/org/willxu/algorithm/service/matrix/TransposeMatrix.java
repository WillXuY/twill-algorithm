/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.matrix;

public interface TransposeMatrix {
    /**
     * Given a 2D integer array matrix, return the transpose of matrix.
     * The transpose of a matrix is the matrix flipped over its main
     * diagonal, switching the matrix's row and column indices.
     *   2,  4, -1       2,-10, 18
     * -10,  5, 11  ->   4,  5, -7
     *  18, -7,  6      -1, 11,  6
     *
     * @param matrix m == matrix.length
     *               n == matrix[i].length
     *               1 <= m,n <= 1000
     *               1 <= m * n <= 10^5
     *               -10^9 <= matrix[i][j] <= 10^9
     * @return the transposed matrix.
     */
    int[][] transpose(int[][] matrix);
}
