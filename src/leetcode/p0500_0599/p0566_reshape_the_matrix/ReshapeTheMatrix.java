/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0566_reshape_the_matrix;

public interface ReshapeTheMatrix {
    /**
     * In MATLAB, there is a handy function called reshape which can
     * reshape an m x n matrix into a new one with a different size
     * r x c keeping its original data.
     * You are given an m x n matrix mat and two integers r and c
     * representing the number of rows and the number of columns of the
     * wanted reshaped matrix.
     * The reshaped matrix should be filled with all the elements of the
     * original matrix in the same row-traversing order as they were.
     * If the reshape operation with given parameters is possible and
     * legal, output the new reshaped matrix; Otherwise, output the
     * original matrix.
     *
     * @param mat 1 <= mat.length <= 100
     *            1 <= mat[i].length <= 100
     *            -1000 <= mat[i][j] <= 1000
     * @param r 1 <= r <= 300
     * @param c 1 <= c <= 300
     * @return the reshape matrix or the origin matrix.
     */
    int[][] matrixReshape(int[][] mat, int r, int c);
}
