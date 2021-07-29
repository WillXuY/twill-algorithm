package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ContainsDuplicateIi;

import java.util.TreeMap;

public class ContainsDuplicateIiMapKey implements ContainsDuplicateIi {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (map.get(nums[i]) < i - k)) {
                map.remove(nums[i]);
            }
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
