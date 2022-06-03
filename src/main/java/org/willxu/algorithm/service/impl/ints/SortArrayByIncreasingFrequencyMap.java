package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.SortArrayByIncreasingFrequency;

import java.util.*;

public class SortArrayByIncreasingFrequencyMap
        implements SortArrayByIncreasingFrequency {
    @Override
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int value : nums) {
            if (countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                countMap.put(value, 1);
            }
        }
        TreeMap<Integer, List<Integer>> sortedNumberMap = new TreeMap<>();
        for (int num: countMap.keySet()) {
            int count = countMap.get(num);
            if (sortedNumberMap.containsKey(count)) {
                List<Integer> numList = sortedNumberMap.get(count);
                for (int i = 0; i < numList.size(); i++) {
                    int n = numList.get(i);
                    if (num > n) {
                        numList.add(i, num);
                        break;
                    }
                    if (i == numList.size() - 1) {
                        numList.add(num);
                        break;
                    }
                }
            } else {
                List<Integer> numList = new ArrayList<>();
                numList.add(num);
                sortedNumberMap.put(count, numList);
            }
        }
        int[] output = new int[nums.length];
        int i = 0;
        for (int count: sortedNumberMap.keySet()) {
            List<Integer> numList = sortedNumberMap.get(count);
            for (int num: numList) {
                for (int c = 0; c < count; c++) {
                    output[i] = num;
                    i++;
                }
            }
        }
        return output;
    }
}
