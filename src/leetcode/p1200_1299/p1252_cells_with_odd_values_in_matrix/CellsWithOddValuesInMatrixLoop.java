package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CellsWithOddValuesInMatrix;

public class CellsWithOddValuesInMatrixLoop
        implements CellsWithOddValuesInMatrix {
    @Override
    public int oddCells(int m, int n, int[][] indices) {
        boolean[][] oddMatrix = new boolean[m][n];
        for (int[] cell: indices) {
            for (int i = 0; i < m; i++) {
                oddMatrix[i][cell[1]] = !oddMatrix[i][cell[1]];
            }
            for (int i = 0; i < n; i++) {
                oddMatrix[cell[0]][i] = !oddMatrix[cell[0]][i];
            }
        }
        int output = 0;
        for (boolean[] row: oddMatrix) {
            for (boolean cell: row) {
                if (cell) {
                    output++;
                }
            }
        }
        return output;
    }
}
