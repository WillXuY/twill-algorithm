package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MatrixDiagonalSum;

public class MatrixDiagonalSumLoop implements MatrixDiagonalSum {
    @Override
    public int diagonalSum(int[][] mat) {
        int center = 0;
        if ((mat.length & 1) == 1) {
            int index = mat.length / 2;
            center = mat[index][index];
        }
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            count += mat[i][i];
            count += mat[i][mat.length - i - 1];
        }
        return count - center;
    }
}
