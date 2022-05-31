package org.willxu.algorithm.service.impl.decimal;

import org.willxu.algorithm.service.decimal.MeanOfArrayAfterRemovingSomeElements;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElementsSort
        implements MeanOfArrayAfterRemovingSomeElements {
    @Override
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int removeLength = arr.length / 20;
        int count = 0;
        for (int i = removeLength; i < arr.length - removeLength; i++) {
            count += arr[i];
        }
        return ((double) count) / (arr.length - 2 * removeLength);
    }
}
