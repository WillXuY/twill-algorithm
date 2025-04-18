package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.BuildArrayFromPermutation;

public class BuildArrayFromPermutationLoop
        implements BuildArrayFromPermutation {
    @Override
    public int[] buildArray(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
}
