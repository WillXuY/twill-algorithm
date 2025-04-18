package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfArrayIsSortedAndRotated;

public class CheckIfArrayIsSortedAndRotatedLoop
        implements CheckIfArrayIsSortedAndRotated {
    @Override
    public boolean check(int[] nums) {
        boolean hasDecreased = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (hasDecreased) {
                    return false;
                } else {
                    hasDecreased = true;
                }
            }
        }
        if (hasDecreased) {
            return nums[nums.length - 1] <= nums[0];
        }
        return true;
    }
}
