package leetcode.p0300_0399.p0347_topk_frequent_elements;

import java.util.*;

public class TopkFrequentElementsMap implements TopkFrequentElements {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        TreeMap<Integer, Set<Integer>> countNumsMap = new TreeMap<>();
        for (int n: nums) {
            if (numCountMap.containsKey(n)) {
                int count = numCountMap.get(n) + 1;
                countNumsMap.get(numCountMap.get(n)).remove(n);
                numCountMap.put(n, count);
                if (countNumsMap.containsKey(count)) {
                    countNumsMap.get(count).add(n);
                } else {
                    Set<Integer> newNumSet = new HashSet<>();
                    newNumSet.add(n);
                    countNumsMap.put(count, newNumSet);
                }
            } else {
                numCountMap.put(n, 1);
                if (countNumsMap.containsKey(1)) {
                    countNumsMap.get(1).add(n);
                } else {
                    Set<Integer> newNumSet = new HashSet<>();
                    newNumSet.add(n);
                    countNumsMap.put(1, newNumSet);
                }
            }
        }
        Set<Integer> output = new HashSet<>();
        int i = 0;
        for (int key: countNumsMap.descendingKeySet()) {
            if (i >= k) {
                break;
            }
            output.addAll(countNumsMap.get(key));
            i += countNumsMap.get(key).size();
        }
        int[] result = new int[output.size()];
        int index = 0;
        for (int o: output) {
            result[index] = o;
            index++;
        }
        return result;
    }
}
