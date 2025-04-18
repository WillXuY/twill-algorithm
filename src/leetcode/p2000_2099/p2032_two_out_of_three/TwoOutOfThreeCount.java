package leetcode.p2000_2099.p2032_two_out_of_three;

import java.util.*;

public class TwoOutOfThreeCount implements TwoOutOfThree {
    @Override
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i: nums1) {
            count.put(i, 1);
        }
        Set<Integer> exist2 = new HashSet<>();
        for (int i: nums2) {
            if (exist2.contains(i)) {
                continue;
            } else {
                exist2.add(i);
            }
            if (count.containsKey(i)) {
                count.put(i, 2);
            } else {
                count.put(i, 1);
            }
        }
        Set<Integer> exist3 = new HashSet<>();
        for (int i: nums3) {
            if (exist3.contains(i)) {
                continue;
            } else {
                exist3.add(i);
            }
            if (count.containsKey(i)) {
                count.put(i, 2);
            }
        }
        List<Integer> output = new ArrayList<>();
        for (int k: count.keySet()) {
            if (count.get(k) == 2) {
                output.add(k);
            }
        }
        return output;
    }
}
