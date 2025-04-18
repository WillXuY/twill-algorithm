package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.ConcatenationOfArray;

public class ConcatenationOfArrayCopy implements ConcatenationOfArray {
    @Override
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] output = new int[len * 2];
        System.arraycopy(nums, 0, output, 0, len);
        System.arraycopy(nums, 0, output, len, len);
        return output;
    }
}
