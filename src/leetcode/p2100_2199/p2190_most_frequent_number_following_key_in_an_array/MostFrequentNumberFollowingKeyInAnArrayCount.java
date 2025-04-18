package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MostFrequentNumberFollowingKeyInAnArray;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKeyInAnArrayCount
        implements MostFrequentNumberFollowingKeyInAnArray {
    @Override
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int n = nums[i + 1];
                if (countMap.containsKey(n)) {
                    countMap.put(n, countMap.get(n) + 1);
                } else {
                    countMap.put(n, 1);
                }
            }
        }
        int output = -1;
        int count = -1;
        for (int k: countMap.keySet()) {
            int val = countMap.get(k);
            if (val > count) {
                count = val;
                output = k;
            }
        }
        return output;
    }
}
