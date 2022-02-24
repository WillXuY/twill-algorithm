package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrencesCount
        implements UniqueNumberOfOccurrences {
    @Override
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
