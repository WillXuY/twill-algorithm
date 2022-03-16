package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.TheWeakestRowsInMatrix;

public class TheWeakestRowsInMatrixSort implements TheWeakestRowsInMatrix {
    @Override
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] rowIndexArray = new int[k];
        int[] rowCountArray = new int[k];
        for (int i = 0; i < k; i++) {
            rowCountArray[i] = Integer.MAX_VALUE;
        }
        for (int rowIndex = 0; rowIndex < mat.length; rowIndex++) {
            int[] row = mat[rowIndex];
            int count = 0;
            for (int i: row) {
                if (i == 1) {
                    count++;
                } else {
                    break;
                }
            }
            for (int i = 0; i < k; i++) {
                if (count < rowCountArray[i]) {
                    System.arraycopy(rowCountArray, i,
                            rowCountArray, i + 1, k - 1 - i);
                    System.arraycopy(rowIndexArray, i,
                            rowIndexArray, i + 1, k - 1 - i);
                    rowCountArray[i] = count;
                    rowIndexArray[i] = rowIndex;
                    break;
                } else if (count == rowCountArray[i] && i < k - 1
                        && count != rowCountArray[i + 1]) {
                    System.arraycopy(rowCountArray, i + 1,
                            rowCountArray, i + 2, k - 2 - i);
                    System.arraycopy(rowIndexArray, i + 1,
                            rowIndexArray, i + 2, k - 2 - i);
                    rowCountArray[i + 1] = count;
                    rowIndexArray[i + 1] = rowIndex;
                    break;
                }
            }
        }
        return rowIndexArray;
    }
}
