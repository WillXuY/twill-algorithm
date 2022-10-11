package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.DivideArrayIntoEqualPairs;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairsParity
        implements DivideArrayIntoEqualPairs {
    @Override
    public boolean divideArray(int[] nums) {
        Map<Integer, Boolean> checkOddMap = new HashMap<>();
        for (int n: nums) {
            if (checkOddMap.containsKey(n)) {
                checkOddMap.put(n, !checkOddMap.get(n));
            } else {
                checkOddMap.put(n, true);
            }
        }
        for (boolean odd: checkOddMap.values()) {
            if (odd) {
                return false;
            }
        }
        return true;
    }
}
