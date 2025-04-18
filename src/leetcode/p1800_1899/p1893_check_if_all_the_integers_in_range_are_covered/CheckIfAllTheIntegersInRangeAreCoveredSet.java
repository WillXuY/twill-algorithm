package leetcode.p1800_1899.p1893_check_if_all_the_integers_in_range_are_covered;

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
