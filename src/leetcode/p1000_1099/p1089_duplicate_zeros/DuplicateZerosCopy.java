package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.service.empty.DuplicateZeros;

public class DuplicateZerosCopy implements DuplicateZeros {
    @Override
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.arraycopy(arr, i, arr, i + 1,
                        arr.length - 1 - i);
                i++;
            }
        }
    }
}
