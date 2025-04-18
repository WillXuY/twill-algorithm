package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindTheMiddleIndexInArray;

public class FindTheMiddleIndexInArraySum implements FindTheMiddleIndexInArray {
    @Override
    public int findMiddleIndex(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        for (int i = 0; i < sum.length; i++) {
            int left = sum[i] - nums[i];
            int right = sum[sum.length - 1] - sum[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
