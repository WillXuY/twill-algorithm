package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LargestPositiveIntegerThatExistsWithItsNegative;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerThatExistsWithItsNegativeSet
        implements LargestPositiveIntegerThatExistsWithItsNegative {
    @Override
    public int findMaxK(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        int output = -1;
        for (int n: nums) {
            if (exist.contains(-n) && Math.abs(n) > output) {
                output = Math.abs(n);
            }
            exist.add(n);
        }
        return output;
    }
}
