package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.KthSmallestElementInSortedMatrix;

import java.util.TreeMap;

public class KthSmallestElementInSortedMatrixSort
        implements KthSmallestElementInSortedMatrix{
    @Override
    public int kthSmallest(int[][] matrix, int k) {
        TreeMap<Integer, Integer> sorted = new TreeMap<>();
        for (int[] ma: matrix) {
            for (int m : ma) {
                if (sorted.containsKey(m)) {
                    sorted.put(m, sorted.get(m) + 1);
                } else {
                    sorted.put(m, 1);
                }
            }
        }
        for (int key: sorted.navigableKeySet()) {
            int value = sorted.get(key);
            if (value >= k) {
                return key;
            } else {
                k -= value;
            }
        }
        return 0;
    }
}
