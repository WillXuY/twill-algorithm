package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.NonDecreasingArray;

public class NonDecreasingArrayLoop implements NonDecreasingArray {
    @Override
    public boolean checkPossibility(int[] nums) {
        int decreasingCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                decreasingCount++;
                if (i >= 2 && nums[i - 2] > nums[i]) {
                    decreasingCount++;
                    if (i + 1 >= nums.length || nums[i - 1] <= nums[i + 1]) {
                        decreasingCount--;
                    }
                }
            }
        }
        return decreasingCount < 2;
    }
}
