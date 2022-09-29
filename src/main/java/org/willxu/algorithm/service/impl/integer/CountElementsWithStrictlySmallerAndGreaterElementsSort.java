package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountElementsWithStrictlySmallerAndGreaterElements;

import java.util.Arrays;

public class CountElementsWithStrictlySmallerAndGreaterElementsSort
        implements CountElementsWithStrictlySmallerAndGreaterElements {
    @Override
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int output = nums.length;
        for (int n: nums) {
            if (n == nums[0] || n == nums[nums.length - 1]) {
                output--;
            }
        }
        return output;
    }
}
