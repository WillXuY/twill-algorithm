package leetcode.p2200_2299.p2206_divide_array_info_equal_pairs;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairsParity
        implements DivideArrayIntoEqualPairs {
    @Override
    public boolean divideArray(int[] nums) {
        Map<Integer, Boolean> checkOddMap = new HashMap<>();
        for (int n: nums) {
            if (checkOddMap.containsKey(n)) {
                checkOddMap.put(n, !checkOddMap.get(n));
            } else {
                checkOddMap.put(n, true);
            }
        }
        for (boolean odd: checkOddMap.values()) {
            if (odd) {
                return false;
            }
        }
        return true;
    }
}
