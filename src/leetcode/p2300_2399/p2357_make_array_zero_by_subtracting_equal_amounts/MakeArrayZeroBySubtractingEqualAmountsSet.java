package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MakeArrayZeroBySubtractingEqualAmounts;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZeroBySubtractingEqualAmountsSet
        implements MakeArrayZeroBySubtractingEqualAmounts {
    @Override
    public int minimumOperations(int[] nums) {
        int hasZero = 0;
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (n == 0) {
                hasZero = 1;
            }
            set.add(n);
        }
        return set.size() - hasZero;
    }
}
