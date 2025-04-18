package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.FindSubarraysWithEqualSum;

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSumLoop
        implements FindSubarraysWithEqualSum {
    @Override
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sum = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            int s = nums[i] + nums[i - 1];
            if (sum.contains(s)) {
                return true;
            }
            sum.add(s);
        }
        return false;
    }
}
