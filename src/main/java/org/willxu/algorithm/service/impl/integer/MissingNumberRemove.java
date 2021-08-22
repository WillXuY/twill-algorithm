package org.willxu.algorithm.service.impl.integer;

import org.gradle.internal.impldep.org.junit.Test;
import org.willxu.algorithm.service.integer.MissingNumber;

import java.util.ArrayList;
import java.util.Set;
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
        if (all.size() > 0) {
            return all.first();
        }
        return 0;
    }
}
