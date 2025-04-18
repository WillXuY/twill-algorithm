package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.ReplaceElementsWithGreatestElementOnRightSide;

public class ReplaceElementsWithGreatestElementOnRightSideLoop
        implements ReplaceElementsWithGreatestElementOnRightSide {
    @Override
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int arrI = arr[i];
            arr[i] = max;
            max = Math.max(max, arrI);
        }
        return arr;
    }
}
