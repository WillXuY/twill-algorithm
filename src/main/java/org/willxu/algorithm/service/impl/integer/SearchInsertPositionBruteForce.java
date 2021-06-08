package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SearchInsertPosition;

public class SearchInsertPositionBruteForce implements SearchInsertPosition {
    @Override
    public int searchInsert(int[] nums, int target) {
        int half = nums.length / 2;
        int max = nums.length - 1;
        int min = 0;
        if (target > nums[max]) {
            return max + 1;
        }
        while (max != min) {
            if (target == nums[half]) {
                return half;
            }
            if (target < nums[half]) {
                max = half;
            } else {
                min = half;
            }
            half = min + (max - min) / 2;
            if (max - min == 1) {
                if (target > nums[min]) {
                    return max;
                } else {
                    return min;
                }
            }
        }
        return min;
    }
}
