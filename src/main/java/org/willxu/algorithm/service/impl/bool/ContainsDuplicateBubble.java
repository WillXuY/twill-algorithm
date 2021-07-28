package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ContainsDuplicate;

public class ContainsDuplicateBubble implements ContainsDuplicate {
    @Override
    public boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] == nums[j + 1]) {
                    return true;
                } else if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] ^ nums[j + 1];
                    nums[j + 1] = nums[j] ^ nums[j + 1];
                    nums[j] = nums[j] ^ nums[j + 1];
                }
            }
        }
        return false;
    }
}
