package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixEdge implements SpiralMatrix {
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int row = 0, col = 0;
        boolean goTop = false, goBottom = false;
        boolean goLeft = false, goRight = true;
        while (left <= right && top <= bottom) {
            result.add(matrix[row][col]);
            if (goRight) {
                if (col >= right) {
                    top++;
                    goBottom = true;
                    goRight = false;
                    row++;
                } else {
                    col++;
                }
            } else if (goBottom) {
                if (row >= bottom) {
                    right--;
                    goLeft = true;
                    goBottom = false;
                    col--;
                } else {
                    row++;
                }
            } else if (goLeft) {
                if (col <= left) {
                    bottom--;
                    goTop = true;
                    goLeft = false;
                    row--;
                } else {
                    col--;
                }
            } else {
                if (row <= top) {
                    left++;
                    goRight = true;
                    goTop = false;
                    col++;
                } else {
                    row--;
                }
            }
        }
        return result;
    }
}
