package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.IntersectionOfMultipleArrays;

import java.util.*;

public class IntersectionOfMultipleArraysMap
        implements IntersectionOfMultipleArrays {
    @Override
    public List<Integer> intersection(int[][] nums) {
        TreeMap<Integer, Boolean> existMap = new TreeMap<>();
        for (int n: nums[0]) {
            existMap.put(n, false);
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (existMap.containsKey(nums[i][j])) {
                    existMap.put(nums[i][j], true);
                }
            }
            Iterator<Map.Entry<Integer, Boolean>> iterator =
                    existMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Boolean> entry = iterator.next();
                if (entry.getValue()) {
                    entry.setValue(false);
                } else {
                    iterator.remove();
                }
            }
        }
        return new ArrayList<>(existMap.keySet());
    }
}
