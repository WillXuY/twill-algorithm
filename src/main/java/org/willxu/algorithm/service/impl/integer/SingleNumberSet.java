package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.SingleNumber;

import java.util.HashSet;

public class SingleNumberSet implements SingleNumber {
    @Override
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}
