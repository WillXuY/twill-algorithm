package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckArrayFormationThroughConcatenation;

public class CheckArrayFormationThroughConcatenationLoop
        implements CheckArrayFormationThroughConcatenation {
    @Override
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int[] row: pieces) {
            int p = row[0];
            int index = 0;
            while (index < arr.length) {
                if (arr[index] == p) {
                    break;
                }
                if (index >= arr.length - 1) {
                    return false;
                }
                index++;
            }
            index++;
            for (int i = 1; i < row.length; i++) {
                if (index >= arr.length || row[i] != arr[index]) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
