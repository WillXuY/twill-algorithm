package org.willxu.algorithm.service.impl.strs;

import org.willxu.algorithm.service.strs.SortThePeople;

import java.util.TreeMap;

public class SortThePeopleTree implements SortThePeople {
    @Override
    public String[] sortPeople(String[] names, int[] heights) {
        int len = names.length;
        TreeMap<Integer, String> sorted = new TreeMap<>();
        for (int i = 0; i < len; i++) {
            sorted.put(heights[i], names[i]);
        }
        String[] output = new String[len];
        int i = len - 1;
        for (String s: sorted.values()) {
            output[i] = s;
            i--;
        }
        return output;
    }
}
