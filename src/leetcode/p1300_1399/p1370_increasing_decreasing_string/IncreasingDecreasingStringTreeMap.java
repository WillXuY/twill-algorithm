package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.IncreasingDecreasingString;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IncreasingDecreasingStringTreeMap
        implements IncreasingDecreasingString {
    @Override
    public String sortString(String s) {
        TreeMap<Character, Integer> sortedCharMap = new TreeMap<>();
        for (char c: s.toCharArray()) {
            if (sortedCharMap.containsKey(c)) {
                sortedCharMap.put(c, sortedCharMap.get(c) + 1);
            } else {
                sortedCharMap.put(c, 1);
            }
        }
        char[] chars = new char[s.length()];
        int index = 0;
        boolean descending = false;
        while (sortedCharMap.size() > 0) {
            Iterator<Map.Entry<Character, Integer>> iterator
                    = sortedCharMap.entrySet().iterator();
            char[] sub = new char[sortedCharMap.size()];
            int subIndex = 0;
            while (iterator.hasNext()) {
                Map.Entry<Character, Integer> entry = iterator.next();
                sub[subIndex] = entry.getKey();
                if (entry.getValue() > 1) {
                    entry.setValue(entry.getValue() - 1);
                } else {
                    iterator.remove();
                }
                subIndex++;
            }
            if (descending) {
                for (int i = 0; i < sub.length / 2; i++) {
                    char exchange = sub[i];
                    sub[i] = sub[sub.length - 1 - i];
                    sub[sub.length - 1 - i] = exchange;
                }
            }
            System.arraycopy(sub, 0, chars, index, subIndex);
            index += subIndex;
            descending = !descending;
        }
        return new String(chars);
    }
}
