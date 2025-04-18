package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindLuckIntegerInAnArray;

import java.util.NavigableSet;
import java.util.TreeMap;

public class FindLuckIntegerInAnArrayCount implements FindLuckIntegerInAnArray {
    @Override
    public int findLucky(int[] arr) {
        int output = -1;
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int i: arr) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }
        NavigableSet<Integer> orderSet = countMap.descendingKeySet();
        for (int i: orderSet) {
            if (i == countMap.get(i)) {
                output = i;
                break;
            }
        }
        return output;
    }
}
