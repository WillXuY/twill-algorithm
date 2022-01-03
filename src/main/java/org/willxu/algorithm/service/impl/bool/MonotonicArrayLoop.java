package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.MonotonicArray;

public class MonotonicArrayLoop implements MonotonicArray {

    /**
     * 1. If nums.length < 3 return true
     * 2. Define boolean increasing.(maybe all same).
     * 3. Loop and compare all the numbers.
     */
    @Override
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        boolean increasing = false;
        boolean confirmOrder = false;
        for (int i = 1; i < nums.length; i++) {
            if (confirmOrder) {
                if (increasing && nums[i] < nums[i - 1]) {
                    return false;
                } else if (!increasing && nums[i] > nums[i - 1]){
                    return false;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    increasing = true;
                    confirmOrder = true;
                } else if (nums[i] < nums[i - 1]) {
                    confirmOrder = true;
                }
            }
        }
        return true;
    }
}
