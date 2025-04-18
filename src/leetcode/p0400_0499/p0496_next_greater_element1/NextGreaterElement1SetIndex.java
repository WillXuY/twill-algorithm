package leetcode.p0400_0499.p0496_next_greater_element1;

import java.util.*;

public class NextGreaterElement1SetIndex implements NextGreaterElement1 {
    @Override
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Set<Integer> noGreater = new HashSet<>();
        for (int n: nums2) {
            // ConcurrentModificationException
            Iterator<Integer> iterator = noGreater.iterator();
            while (iterator.hasNext()) {
                int i = iterator.next();
                if (i < n) {
                    nextGreaterMap.put(i, n);
                    iterator.remove();
                }
            }
            nextGreaterMap.put(n, -1);
            noGreater.add(n);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreaterMap.get(nums1[i]);
        }
        return nums1;
    }
}
