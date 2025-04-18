package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.SortEvenAndOddIndicesIndependently;

import java.util.ArrayList;
import java.util.List;

public class SortEvenAndOddIndicesIndependentlyInsert
        implements SortEvenAndOddIndicesIndependently {
    @Override
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> oddIndex = new ArrayList<>();
        List<Integer> evenIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int insert = -1;
            if ((i & 1) == 1) {
                for (int j = 0; j < oddIndex.size(); j++) {
                    if (nums[i] > nums[oddIndex.get(j)]) {
                        insert = j;
                        break;
                    }
                }
                if (insert != -1) {
                    oddIndex.add(insert, i);
                } else {
                    oddIndex.add(i);
                }
            } else {
                for (int j = 0; j < evenIndex.size(); j++) {
                    if (nums[i] < nums[evenIndex.get(j)]) {
                        insert = j;
                        break;
                    }
                }
                if (insert != -1) {
                    evenIndex.add(insert, i);
                } else {
                    evenIndex.add(i);
                }
            }
        }
        int[] output = new int[nums.length];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < output.length; i++) {
            if ((i & 1) == 1) {
                output[i] = nums[oddIndex.get(odd)];
                odd++;
            } else {
                output[i] = nums[evenIndex.get(even)];
                even++;
            }
        }
        return output;
    }
}
