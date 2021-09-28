package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaxConsecutiveOnes;

public class MaxConsecutiveOnesLoop implements MaxConsecutiveOnes {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int length = 0;
        for (int i: nums) {
            if (i == 1) {
                length++;
            } else {
                length = 0;
            }
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
