package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.FindTargetIndicesAfterSortingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArraySort
        implements FindTargetIndicesAfterSortingArray {
    @Override
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                output.add(i);
            }
        }
        return output;
    }
}
