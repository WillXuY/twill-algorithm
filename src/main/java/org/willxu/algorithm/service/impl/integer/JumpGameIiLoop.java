package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.JumpGameIi;

import java.util.HashSet;
import java.util.Set;

public class JumpGameIiLoop implements JumpGameIi {
    @Override
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Set<Integer> indexSteps = new HashSet<>();
        Set<Integer> reachedIndex = new HashSet<>();
        indexSteps.add(nums.length - 1);
        int result = 0;
        while (indexSteps.size() > 0) {
            Set<Integer> nextIndexSteps = new HashSet<>();
            for (int index: indexSteps) {
                for (int i = index - 1; i >= 0; i--) {
                    if (reachedIndex.contains(i)) {
                        continue;
                    }
                    if (nums[i] >= index - i) {
                        if (i == 0) {
                            result++;
                            return result;
                        }
                        nextIndexSteps.add(i);
                        reachedIndex.add(i);
                    }
                }
            }
            indexSteps = nextIndexSteps;
            result++;
        }
        return result;
    }
}
