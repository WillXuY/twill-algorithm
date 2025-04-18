package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.ShuffleTheArray;

public class ShuffleTheArrayExchange implements ShuffleTheArray {
    @Override
    public int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int indexX = 0, indexY = n;
        for (int i = 0; i < output.length; i++) {
            if ((i & 1) == 0) {
                output[i] = nums[indexX];
                indexX++;
            } else {
                output[i] = nums[indexY];
                indexY++;
            }
        }
        return output;
    }
}
