/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.ReshapeTheMatrix;

public class ReshapeTheMatrixIterator implements ReshapeTheMatrix {
    @Override
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int size = mat.length * mat[0].length;
        if (r * c != size) {
            return mat;
        }
        int[][] output = new int[r][c];
        int row = 0;
        int col = 0;
        for (int[] ints : mat) {
            for (int i: ints) {
                output[row][col] = i;
                col++;
                if (col >= c) {
                    row++;
                    col = 0;
                }
            }
        }
        return output;
    }
}
