/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0766_toeplitz_matrix;

public interface ToeplitzMatrix {
    /**
     * Given an m x n matrix, return true if the matrix is Toeplitz.
     * Otherwise, return false.
     * A matrix is Toeplitz if every diagonal from top-left to
     * bottom-right has the same elements.
     * Follow up:
     * - What if the matrix is stored on disk, and the memory is limited
     *   such that you can only load at most one row of the matrix into
     *   the memory at once?
     * - What if the matrix is so large that you can only load up a
     *   partial row into the memory at once?
     *
     * @param matrix 1 <= matrix.length, matrix[i].length <= 20
     *               0 <= matrix[i][j] <= 99
     * @return is a teoplitz matrix.
     */
    boolean isToeplitzMatrix(int[][] matrix);
}
