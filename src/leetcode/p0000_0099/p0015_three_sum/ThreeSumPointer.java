package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumPointer implements ThreeSum {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return Collections.emptyList();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> o = new ArrayList<>();
                    o.add(nums[i]);
                    o.add(nums[low]);
                    o.add(nums[high]);
                    output.add(o);
                    int newLow = low + 1;
                    while (nums[newLow] == nums[low]) {
                        newLow++;
                        if (newLow >= high) {
                            break;
                        }
                    }
                    low = newLow;
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
                i++;
            }
        }
        return output;
    }
}
