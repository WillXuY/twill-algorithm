package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ContainsDuplicateIi;

import java.util.TreeMap;

public class ContainsDuplicateIiMapValue implements ContainsDuplicateIi {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i])) {
                return true;
            }
            map.put(i, nums[i]);
            map.remove(i - k);
        }
        return false;
    }
}
