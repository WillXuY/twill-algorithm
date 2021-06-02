package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.RemoveElement;

public class RemoveElementBruteForce implements RemoveElement {
    @Override
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        index--;
        return index + 1;
    }
}
