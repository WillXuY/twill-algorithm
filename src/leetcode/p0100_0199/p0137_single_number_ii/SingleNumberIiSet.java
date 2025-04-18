package leetcode.p0100_0199.p0137_single_number_ii;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIiSet implements SingleNumberIi {
    @Override
    public int singleNumber(int[] nums) {
        Set<Integer> existSet = new HashSet<>();
        Set<Integer> singleSet = new HashSet<>();
        for (int n: nums) {
            if (existSet.contains(n)) {
                singleSet.remove(n);
            } else {
                singleSet.add(n);
                existSet.add(n);
            }
        }
        for (int s: singleSet) {
            return s;
        }
        return -1;
    }
}
