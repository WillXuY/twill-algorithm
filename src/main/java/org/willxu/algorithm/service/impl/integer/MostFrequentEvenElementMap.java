package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MostFrequentEvenElement;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElementMap implements MostFrequentEvenElement {
    @Override
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int max = -1;
        for (int key: nums) {
            if ((key & 1) == 1) {
                continue;
            }
            int val;
            if (countMap.containsKey(key)) {
                val = countMap.get(key) + 1;
            } else {
                val = 1;
            }
            countMap.put(key, val);
            if (max == -1) {
                max = key;
            } else if (val > countMap.get(max)) {
                max = key;
            } else if (val == countMap.get(max) && key < max) {
                max = key;
            }
        }
        return max;
    }
}
