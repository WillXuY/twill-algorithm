package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumMovesToEqualArrayElements;

public class MinimumMovesToEqualArrayElementsMath
        implements MinimumMovesToEqualArrayElements {
    @Override
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int i: nums) {
            sum += i;
            if (i < min) {
                min = i;
            }
        }
        return sum - min * nums.length;
    }
}
