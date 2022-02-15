package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.RelativeSortArray;

public class RelativeSortArrayInsert implements RelativeSortArray {
    /**
     * 1. new array which's length is equals arr1.
     * 2. copy arr2 to new array.
     * 3. Loop arr1 insert into new array.
     *   1) If arr1[i] equals new array[i] array copy (deal the first)
     *   2) If meet 0 insert here
     *   3) If arr1[i] is less than array[i] insert here.
     *
     *
     * @param arr1 1 <= arr1.length <= 1000
     *             0 <= arr1[i] <= 1000
     *             Each arr2[i] is in arr1.
     * @param arr2 1 <= arr2.length <= 1000
     *             0 <= arr2[i] <= 1000
     *             All the elements of arr2 are distinct.
     * @return insert elements into arr2 from arr1.
     */
    @Override
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length];
        System.arraycopy(arr2, 0, output, 0, arr2.length);
        int len = arr2.length;
        for (int i = 0; i < arr1.length; i++) {
            if (i < len) {
                output[i] = -1 - output[i];
            } else {
                output[i] = Integer.MAX_VALUE;
            }
        }
        for (int i: arr1) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == -1 - output[j]) {
                    output[j] = i;
                    break;
                } else if (i == output[j]) {
                    System.arraycopy(output, j, output, j + 1,
                            arr1.length - j - 1);
                    if (j < len) {
                        len++;
                    }
                    break;
                } else if (i < output[j] && j >= len) {
                    System.arraycopy(output, j, output, j + 1,
                            arr1.length - j - 1);
                    output[j] = i;
                    break;
                } else if (Integer.MAX_VALUE == output[j]) {
                    output[j] = i;
                    break;
                }
            }
        }
        return output;
    }
}
