package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.FindAllDistantIndicesInAnArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllDistantIndicesInAnArrayLoop
        implements FindAllDistantIndicesInAnArray {
    @Override
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> output = new ArrayList<>();
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                continue;
            }
            int start = Math.max(lastIndex + 1, i - k);
            if (lastIndex != -1) {
                int lastEnd = Math.min(start - 1, lastIndex + k);
                for (int j = lastIndex + 1; j <= lastEnd; j++) {
                    output.add(j);
                }
            }
            for (int j = start; j <= i; j++) {
                output.add(j);
            }
            lastIndex = i;
        }
        if (output.size() > 0) {
            int last = output.get(output.size() - 1);
            int followEnd = Math.min(nums.length - 1, last + k);
            for (int i = last + 1; i <= followEnd; i++) {
                output.add(i);
            }
        }
        return output;
    }
}
