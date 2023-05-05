package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindPeakElement;

public class FindPeakElementLoop implements FindPeakElement {
    @Override
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
