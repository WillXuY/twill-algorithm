package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountEqualAndDivisiblePairsInAnArray ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountEqualAndDivisiblePairsInAnArrayCount
        implements CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        Map<Integer, List<Integer>> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list;
            if (count.containsKey(nums[i])) {
                list = count.get(nums[i]);
            } else {
                list = new ArrayList<>();
            }
            list.add(i);
            count.put(nums[i], list);
        }
        int output = 0;
        for (List<Integer> list: count.values()) {
            int size = list.size();
            if (size <= 1) {
                continue;
            }
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (list.get(i) * list.get(j) % k == 0) {
                        output++;
                    }
                }
            }
        }
        return output;
    }
}
