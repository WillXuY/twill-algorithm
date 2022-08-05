package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfAllTheIntegersInRangeAreCovered;

import java.util.HashSet;
import java.util.Set;

public class CheckIfAllTheIntegersInRangeAreCoveredSet
        implements CheckIfAllTheIntegersInRangeAreCovered {
    @Override
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> all = new HashSet<>();
        for (int[] r: ranges) {
            for (int i = r[0]; i <= r[1]; i++) {
                all.add(i);
            }
        }
        for (int i = left; i <= right; i++) {
            if (!all.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
