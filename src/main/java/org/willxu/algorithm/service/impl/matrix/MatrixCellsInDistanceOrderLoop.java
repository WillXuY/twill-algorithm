package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.MatrixCellsInDistanceOrder;

public class MatrixCellsInDistanceOrderLoop
        implements MatrixCellsInDistanceOrder {
    /**
     * 1. Loop distance = 0, distance++;
     * 2. Loop rowDistance = 0 ~ distance;
     * 3. colDistance = distance - rowDistance;
     *
     * @param rows 1 <= rows <= 100
     * @param cols 1 <= cols <= 100
     * @param rCenter 0 <= rCenter < rows
     * @param cCenter 0 <= cCenter < cols
     * @return points
     */
    @Override
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] output = new int[rows * cols][2];
        int outputIndex = 0;
        int distance = 0;
        while (outputIndex < rows * cols) {
            for (int rowDistance = 0; rowDistance <= distance; rowDistance++) {
                int colDistance = distance - rowDistance;
                int top = rCenter - rowDistance;
                int bottom = rCenter + rowDistance;
                int left = cCenter - colDistance;
                int right = cCenter + colDistance;
                if (left >= 0) {
                    if (top >= 0) {
                        output[outputIndex] = new int[] {top, left};
                        outputIndex++;
                    }
                    if (bottom < rows && top != bottom) {
                        output[outputIndex] = new int[] {bottom, left};
                        outputIndex++;
                    }
                }
                if (right < cols && right != left) {
                    if (top >= 0) {
                        output[outputIndex] = new int[] {top, right};
                        outputIndex++;
                    }
                    if (bottom < rows && bottom != top) {
                        output[outputIndex] = new int[] {bottom, right};
                        outputIndex++;
                    }
                }
            }
            distance++;
        }
        return output;
    }
}
