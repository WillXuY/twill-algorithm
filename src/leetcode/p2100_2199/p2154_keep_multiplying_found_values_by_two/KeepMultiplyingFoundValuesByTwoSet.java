package leetcode.p2100_2199.p2154_keep_multiplying_found_values_by_two;

import java.util.HashSet;
import java.util.Set;

public class KeepMultiplyingFoundValuesByTwoSet implements KeepMultiplyingFoundValuesByTwo {
    @Override
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }
        int output = original;
        while (output < 2048) {
            if (!set.contains(output)) {
                break;
            } else {
                output *= 2;
            }
        }
        return output;
    }
}
