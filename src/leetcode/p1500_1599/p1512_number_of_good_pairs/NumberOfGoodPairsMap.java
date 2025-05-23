package leetcode.p1500_1599.p1512_number_of_good_pairs;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairsMap implements NumberOfGoodPairs {
    @Override
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int output = 0;
        for (int n: nums) {
            if (countMap.containsKey(n)) {
                output += countMap.get(n);
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        }
        return output;
    }
}
