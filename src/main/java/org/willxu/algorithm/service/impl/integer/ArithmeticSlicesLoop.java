package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ArithmeticSlices;

public class ArithmeticSlicesLoop implements ArithmeticSlices {
    @Override
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int diff = nums[i + 1] - nums[i];
            for (int j = i + 2; j < nums.length; j++) {
                if (nums[j] - nums[j - 1] == diff) {
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
