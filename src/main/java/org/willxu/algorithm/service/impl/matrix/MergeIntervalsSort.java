package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.MergeIntervals;

import java.util.TreeMap;

public class MergeIntervalsSort implements MergeIntervals {
    @Override
    public int[][] merge(int[][] intervals) {
        TreeMap<Integer, Integer> startMap = new TreeMap<>();
        // start in the map will be ascending order.
        for (int[] i: intervals) {
            if (startMap.containsKey(i[0])) {
                startMap.put(i[0], Math.max(startMap.get(i[0]), i[1]));
            } else {
                startMap.put(i[0], i[1]);
            }
        }
        TreeMap<Integer, Integer> mergeMap = new TreeMap<>();
        for (int key: startMap.keySet()) {
            int val = startMap.get(key);
            if (mergeMap.size() == 0) {
                mergeMap.put(key, val);
                continue;
            }
            int lastKey = mergeMap.lastKey();
            int lastVal = mergeMap.get(lastKey);
            if (key <= lastVal) {
                mergeMap.put(lastKey, Math.max(val, lastVal));
            } else {
                mergeMap.put(key, val);
            }
        }
        int[][] result = new int[mergeMap.size()][2];
        int resultIndex = 0;
        for (int k: mergeMap.keySet()) {
            result[resultIndex][0] = k;
            result[resultIndex][1] = mergeMap.get(k);
            resultIndex++;
        }
        return result;
    }
}
