package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.RemoveLetterToEqualizeFrequency;

import java.util.HashMap;
import java.util.Map;

public class RemoveLetterToEqualizeFrequencyCount
        implements RemoveLetterToEqualizeFrequency {
    @Override
    public boolean equalFrequency(String word) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c: word.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        int max = 0;
        int countMax = 0;
        int second = 0;
        int countSecond = 0;
        for (int v: count.values()) {
            if (v > max) {
                if (max == 0) {
                    max = v;
                    countMax = 1;
                } else {
                    if (second == 0) {
                        second = max;
                        countSecond = countMax;
                        max = v;
                        countMax = 1;
                    } else {
                        return false;
                    }
                }
            } else if (v == max) {
                countMax++;
            } else if (v > second) {
                if (second == 0) {
                    second = v;
                    countSecond = 1;
                } else {
                    return false;
                }
            } else if (v == second) {
                countSecond++;
            } else {
                return false;
            }
        }
        boolean secondOne = second == 1 && countSecond == 1;
        boolean removeMaxOne = countMax == 1 && max - 1 == second;
        boolean onlyOneMax = second == 0 && countMax == 1;
        return secondOne || max == 1 || removeMaxOne || onlyOneMax;
    }
}
