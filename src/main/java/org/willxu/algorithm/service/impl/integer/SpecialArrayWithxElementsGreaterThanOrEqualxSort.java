package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SpecialArrayWithxElementsGreaterThanOrEqualX;

import java.util.Arrays;

public class SpecialArrayWithxElementsGreaterThanOrEqualxSort
        implements SpecialArrayWithxElementsGreaterThanOrEqualX {
    @Override
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int numberLeft = nums.length - i;
            if (numberLeft <= nums[i]) {
                if (i > 0 && nums[i - 1] >= numberLeft) {
                    return -1;
                }
                return numberLeft;
            }
        }
        return -1;
    }
}
