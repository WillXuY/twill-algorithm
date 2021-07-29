package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ContainsDuplicateIi;

import java.util.ArrayList;

public class ContainsDuplicateIiList implements ContainsDuplicateIi {
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return true;
            }
            list.add(num);
            if (list.size() > k) {
                list.remove(0);
            }
        }
        return false;
    }
}
