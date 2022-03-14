package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.RankTransformOfAnArray;

public class RankTransformOfAnArrayPointer implements RankTransformOfAnArray {
    /**
     * Time Limit Exceeded: Loop the output array.
     * Time Limit Exceeded: Save the index order from large to small.
     *
     * @param arr 0 <= arr.length <= 10^5
     *            -10^9 <= arr[i] <= 10^9
     * @return rank array of arr.
     */
    @Override
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        int[] output = new int[arr.length];
        output[0] = 1;
        // from large to small
        int[] indexArrOrder = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            // loop the index of output
            for (int j = 0; j < i; j++) {
                if (arr[indexArrOrder[j]] > arr[i]) {
                    output[indexArrOrder[j]]++;
                    if (j == i - 1) {
                        output[i] = 1;
                        indexArrOrder[i] = i;
                    }
                } else if (arr[indexArrOrder[j]] == arr[i]) {
                    output[i] = output[indexArrOrder[j]];
                    System.arraycopy(indexArrOrder, j,
                            indexArrOrder, j + 1, i - j);
                    indexArrOrder[j] = i;
                    // decrease the rank before indexArrOrder[j];
                    for (int k = 0; k < j; k++) {
                        output[indexArrOrder[k]]--;
                    }
                    break;
                } else {
                    output[i] = output[indexArrOrder[j]] + 1;
                    System.arraycopy(indexArrOrder, j,
                            indexArrOrder, j + 1, i - j);
                    indexArrOrder[j] = i;
                    break;
                }
            }
        }
        return output;
    }
}
