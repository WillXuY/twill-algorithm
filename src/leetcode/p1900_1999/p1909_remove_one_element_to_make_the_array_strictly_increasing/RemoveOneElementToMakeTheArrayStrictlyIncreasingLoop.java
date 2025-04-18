package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.RemoveOneElementToMakeTheArrayStrictlyIncreasing;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasingLoop
        implements RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    @Override
    public boolean canBeIncreasing(int[] nums) {
        boolean hasDecreased = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (hasDecreased) {
                    return false;
                } else if (i > 1 && nums[i] <= nums[i - 2]
                        && i < nums.length - 1 && nums[i + 1] <= nums[i - 1]) {
                    return false;
                } else {
                    hasDecreased = true;
                }
            }
        }
        return true;
    }
}
