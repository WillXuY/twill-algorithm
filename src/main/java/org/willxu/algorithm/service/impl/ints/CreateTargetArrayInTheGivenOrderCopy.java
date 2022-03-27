package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.CreateTargetArrayInTheGivenOrder;

public class CreateTargetArrayInTheGivenOrderCopy
        implements CreateTargetArrayInTheGivenOrder{
    @Override
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] output = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            int insert = index[i];
            int value = nums[i];
            System.arraycopy(output, insert, output, insert + 1, i - insert);
            output[insert] = value;
        }
        return output;
    }
}
