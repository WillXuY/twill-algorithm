package org.willxu.algorithm.service.integer;

public interface CountSquareSubmatricesWithAllOnes {
    /**
     * Given a m * n matrix of ones and zeros, return how many square
     * submatrices have all ones.
     *
     * @param matrix 1 <= arr.length <= 300
     *               1 <= arr[0].length <= 300
     *               0 <= arr[i][j] <= 1
     */
    int countSquares(int[][] matrix);
}
