package leetcode.p1300_1399.p1365_how_many_numbers_are_smaller_than_the_current_number;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTreeMap
        implements HowManyNumbersAreSmallerThanTheCurrentNumber {
    @Override
    public int[] smallerNumbersThanCurrent(int[] nums) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int n: nums) {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        }
        Map<Integer, Integer> lessMap = new HashMap<>();
        int count = 0;
        for (int i: countMap.keySet()) {
            lessMap.put(i, count);
            count += countMap.get(i);
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = lessMap.get(nums[i]);
        }
        return output;
    }
}
