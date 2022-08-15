package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfAllCharactersHaveEqualNumberOfOccurrences;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesMap
        implements CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    @Override
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int count = -1;
        for (int i: map.values()) {
            if (count == -1) {
                count = i;
            } else if (count != i) {
                return false;
            }
        }
        return true;
    }
}
