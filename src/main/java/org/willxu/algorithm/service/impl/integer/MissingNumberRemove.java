package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MissingNumber;

import java.util.TreeSet;

public class MissingNumberRemove implements MissingNumber {
    @Override
    public int missingNumber(int[] nums) {
        TreeSet<Integer> all = new TreeSet<>();
        for (int i = 0; i <= nums.length; i++) {
            all.add(i);
        }
        for (Integer n: nums) {
            all.remove(n);
        }
        if (!all.isEmpty()) {
            return all.first();
        }
        return 0;
    }
}
