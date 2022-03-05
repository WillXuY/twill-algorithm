package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ElementAppearingMoreThan25pInSortedArray;

public class ElementAppearingMoreThan25pInSortedArrayCount
        implements ElementAppearingMoreThan25pInSortedArray {
    @Override
    public int findSpecialInteger(int[] arr) {
        int last = -1;
        int count = 0;
        for (int i: arr) {
            if (i == last) {
                count++;

            } else {
                last = i;
                count = 1;
            }
            if (count * 4 > arr.length) {
                return i;
            }
        }
        return -1;
    }
}
