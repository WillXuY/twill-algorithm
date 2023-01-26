package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArrayLoop
        implements SearchInRotatedSortedArray {
    @Override
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
