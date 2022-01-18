package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NrepeatedElementInSize2nArray;

import java.util.HashSet;
import java.util.Set;

public class NrepeatedElementInSize2nArraySet
        implements NrepeatedElementInSize2nArray {
    /**
     * 1. Save numbers in nums into set.
     * 2. Check number is exit in set.
     *
     * @param nums nums.length = 2 * n
     *             0 <= nums[i] <= 10^4
     *             contains n + 1 unique elements and one of them is
     *             repeated exactly n times.
     * @return number repeated.
     */
    @Override
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            if (set.contains(i)) {
                return i;
            } else {
                set.add(i);
            }
        }
        return -1;
    }
}
