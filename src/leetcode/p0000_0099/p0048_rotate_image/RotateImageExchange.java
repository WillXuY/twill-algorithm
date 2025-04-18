package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.service.empty.RotateImage;

public class RotateImageExchange implements RotateImage {
    @Override
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < (len + 1) / 2; j++) {
                int exchange = matrix[i][j];
                matrix[i][j] = matrix[len - 1 -j][i];
                matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
                matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = exchange;
            }
        }
    }
}
