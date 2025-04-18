package leetcode.p1400_1499.p1460_make_two_arrays_equal_by_reversing_sub_arrays;

import java.util.HashMap;
import java.util.Map;

public class MakeTwoArraysEqualByReversingSubArraysMap
        implements MakeTwoArraysEqualByReversingSubArrays {
    @Override
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> elementsCountMap = new HashMap<>();
        for (int i: target) {
            if (elementsCountMap.containsKey(i)) {
                elementsCountMap.put(i, elementsCountMap.get(i) + 1);
            } else {
                elementsCountMap.put(i, 1);
            }
        }
        for (int a: arr) {
            if (elementsCountMap.containsKey(a)) {
                int count = elementsCountMap.get(a);
                if (count > 1) {
                    elementsCountMap.put(a, count - 1);
                } else if (count == 1) {
                    elementsCountMap.remove(a);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return elementsCountMap.isEmpty();
    }
}
