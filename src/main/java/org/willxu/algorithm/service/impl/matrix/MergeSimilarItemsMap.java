package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.MergeSimilarItems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MergeSimilarItemsMap implements MergeSimilarItems {
    @Override
    public List<List<Integer>> mergeSimilarItems(
            int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        addAll(treeMap, items1);
        addAll(treeMap, items2);
        List<List<Integer>> output = new ArrayList<>();
        for (int key: treeMap.keySet()) {
            List<Integer> o = new ArrayList<>();
            o.add(key);
            o.add(treeMap.get(key));
            output.add(o);
        }
        return output;
    }

    private void addAll(TreeMap<Integer, Integer> treeMap, int[][] items) {
        for (int[] i: items) {
            if (treeMap.containsKey(i[0])) {
                treeMap.put(i[0], treeMap.get(i[0]) + i[1]);
            } else {
                treeMap.put(i[0], i[1]);
            }
        }
    }
}
