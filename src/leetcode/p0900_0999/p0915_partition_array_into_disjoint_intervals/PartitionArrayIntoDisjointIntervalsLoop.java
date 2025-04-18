package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.PartitionArrayIntoDisjointIntervals;

public class PartitionArrayIntoDisjointIntervalsLoop
        implements PartitionArrayIntoDisjointIntervals {
    @Override
    public int partitionDisjoint(int[] nums) {
        int partition = 0;
        int leftMax = nums[0];
        int rightMax = nums[1];
        for (int i = 2; i < nums.length; i++) {
            while (leftMax > rightMax) {
                partition++;
                rightMax = nums[i];
                i++;
            }
            if (i >= nums.length) {
                break;
            }
            if (nums[i] < leftMax) {
                leftMax = rightMax;
                rightMax = -1;
                partition = i - 1;
            } else if (nums[i] > rightMax) {
                rightMax = nums[i];
            }
        }
        return partition + 1;
    }
}
