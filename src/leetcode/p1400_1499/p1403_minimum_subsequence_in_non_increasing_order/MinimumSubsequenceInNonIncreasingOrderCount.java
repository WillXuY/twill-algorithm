package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.MinimumSubsequenceInNonIncreasingOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrderCount
        implements MinimumSubsequenceInNonIncreasingOrder {
    @Override
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int[] counts = new int[nums.length];
        counts[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            counts[i] = counts[i - 1] + nums[i];
        }
        List<Integer> output = new ArrayList<>();
        output.add(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (counts[i] * 2 >= counts[nums.length - 1]) {
                output.add(nums[i]);
            } else {
                break;
            }
        }
        return output;
    }
}
