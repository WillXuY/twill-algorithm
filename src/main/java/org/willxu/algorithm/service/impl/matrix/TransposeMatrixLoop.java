/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.TransposeMatrix;

public class TransposeMatrixLoop implements TransposeMatrix {
    /**
     * get the length m, n
     * new int[n][m]
     * loop add number in matrix.
     */
    @Override
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}
