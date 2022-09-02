package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.Convert1dArrayInto2dArray;

public class Convert1dArrayInto2dArrayLoop implements
        Convert1dArrayInto2dArray {
    @Override
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][] {};
        }
        int[][] output = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            output[i / n][i % n] = original[i];
        }
        return output;
    }
}
