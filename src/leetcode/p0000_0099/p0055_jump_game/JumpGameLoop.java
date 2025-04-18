package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.JumpGame;

public class JumpGameLoop implements JumpGame {
    @Override
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int end = nums[0];
        int maxRange = 0;
        for (int i = 0; i < nums.length; i++) {
            int range = i + nums[i];
            if (range >= nums.length - 1) {
                break;
            }
            if (range > maxRange) {
                maxRange = range;
            }
            if (i >= end) {
                if (maxRange == end) {
                    return false;
                }
                end = maxRange;
            }
        }
        return true;
    }
}
