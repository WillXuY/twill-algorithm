package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfEveryRowAndColumnContainsAllNumbers;

public class CheckIfEveryRowAndColumnContainsAllNumbersLoop
        implements CheckIfEveryRowAndColumnContainsAllNumbers {
    @Override
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        for (int[] row: matrix) {
            boolean[] contains = new boolean[len + 1];
            for (int i: row) {
                contains[i] = true;
            }
            for (int i = 1; i < contains.length; i++) {
                if (!contains[i]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            boolean[] contains = new boolean[len + 1];
            for (int[] row: matrix) {
                contains[row[i]] = true;
            }
            for (int j = 1; j < contains.length; j++) {
                if (!contains[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
