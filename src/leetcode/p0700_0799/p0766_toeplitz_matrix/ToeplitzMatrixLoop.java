/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0766_toeplitz_matrix;

public class ToeplitzMatrixLoop implements ToeplitzMatrix {
    @Override
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // loop by row 0 ~ row - 1
        for (int i = 0; i < matrix.length; i++) {
            int first = matrix[i][0];
            for (int j = 1; j < cols && j < rows - i; j++) {
                if (matrix[i + j][j] != first) {
                    return false;
                }
            }
        }
        // loop by column 1 ~ col - 1
        for (int i = 1; i < matrix[0].length; i++) {
            int first = matrix[0][i];
            for (int j = 1; j < rows && j < cols - i; j++) {
                if (matrix[j][i + j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
