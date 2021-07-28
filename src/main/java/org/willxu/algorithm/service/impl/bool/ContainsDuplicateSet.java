package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ContainsDuplicate;

import java.util.HashSet;

public class ContainsDuplicateSet implements ContainsDuplicate {
    @Override
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                // Wrong answer1: Add the index to the set.
                set.add(num);
            }
        }
        return false;
    }
}
