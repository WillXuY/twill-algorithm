package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LargestPerimeterTriangle;

import java.util.Comparator;
import java.util.TreeMap;

public class LargestPerimeterTriangleMap implements LargestPerimeterTriangle {
    /**
     * 1. Save the number in descending map.
     * 2. Find the largest c + b > a
     *
     * @param nums 3 <= nums.length <= 10^4
     *             1 <= nums[i] <= 10^6
     * @return a + b + c
     */
    @Override
    public int largestPerimeter(int[] nums) {
        TreeMap<Integer, Integer> treeMap =
                new TreeMap<>(Comparator.reverseOrder());
        for (int i: nums) {
            if (treeMap.containsKey(i)) {
                treeMap.put(i, treeMap.get(i) + 1);
            } else {
                treeMap.put(i, 1);
            }
        }
        int a = 0, b = 0, c;
        for (int i: treeMap.keySet()) {
            int v = treeMap.get(i);
            if (a == 0) {
                a = i;
                v--;
                if (v <= 0) {
                    continue;
                }
            }
            if (b == 0) {
                b = i;
                v--;
                if (v <= 0) {
                    continue;
                }
            }
            while (v > 0) {
                c = i;
                if (c + b > a) {
                    return c + b + a;
                } else {
                    a = b;
                    b = c;
                }
                v--;
            }
        }
        return 0;
    }
}
