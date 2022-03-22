package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.HowManyNumbersAreSmallerThanTheCurrentNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTreeMap
        implements HowManyNumbersAreSmallerThanTheCurrentNumber {
    @Override
    public int[] smallerNumbersThanCurrent(int[] nums) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int n: nums) {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        }
        Map<Integer, Integer> lessMap = new HashMap<>();
        int count = 0;
        for (int i: countMap.keySet()) {
            lessMap.put(i, count);
            count += countMap.get(i);
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = lessMap.get(nums[i]);
        }
        return output;
    }
}
