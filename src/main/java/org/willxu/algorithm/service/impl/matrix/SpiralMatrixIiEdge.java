package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.SpiralMatrixIi;

public class SpiralMatrixIiEdge implements SpiralMatrixIi {
    @Override
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        boolean goRight = true, goLeft = false;
        boolean goUp = false, goDown = false;
        int value = 1;
        int right = n - 1, left = 0, top = 0, down = n - 1;
        int i = 0, j = 0;
        while (top <= down && left <= right) {
            result[i][j] = value;
            if (goRight) {
                j++;
                if (j >= right) {
                    goRight = false;
                    goDown = true;
                    top++;
                }
            } else if (goDown) {
                i++;
                if (i >= down) {
                    goDown = false;
                    goLeft = true;
                    right--;
                }
            } else if (goLeft) {
                j--;
                if (j <= left) {
                    goLeft = false;
                    goUp = true;
                    down--;
                }
            } else {
                i--;
                if (i <= top) {
                    goUp = false;
                    goRight = true;
                    left++;
                }
            }
            value++;
        }
        if (value == n * n) {
            result[i][j] = value;
        }
        return result;
    }
}
