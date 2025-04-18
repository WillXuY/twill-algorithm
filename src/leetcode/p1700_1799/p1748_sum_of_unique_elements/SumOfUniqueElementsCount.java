package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SumOfUniqueElements;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElementsCount implements SumOfUniqueElements {
    @Override
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> numSum = new HashMap<>();
        for (int n: nums) {
            if (numSum.containsKey(n)) {
                int sum = numSum.get(n);
                if (sum == 1) {
                    numSum.put(n, 2);
                }
            } else {
                numSum.put(n, 1);
            }
        }
        int output = 0;
        for (int key: numSum.keySet()) {
            int value = numSum.get(key);
            if (value == 1) {
                output += key;
            }
        }
        return output;
    }
}
