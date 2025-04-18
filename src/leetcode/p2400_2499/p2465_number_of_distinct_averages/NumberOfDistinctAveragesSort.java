package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfDistinctAverages;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAveragesSort implements NumberOfDistinctAverages {
    @Override
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> sum = new HashSet<>();
        for (int i = 0; i < nums.length / 2; i++) {
            sum.add(nums[i] + nums[nums.length - 1 - i]);
        }
        return sum.size();
    }
}
