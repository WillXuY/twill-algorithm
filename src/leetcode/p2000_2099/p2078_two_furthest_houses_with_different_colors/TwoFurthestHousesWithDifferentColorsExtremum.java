package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.TwoFurthestHousesWithDifferentColors;

import java.util.HashMap;
import java.util.Map;

public class TwoFurthestHousesWithDifferentColorsExtremum
        implements TwoFurthestHousesWithDifferentColors {
    @Override
    public int maxDistance(int[] colors) {
        Map<Integer, Integer> minMap = new HashMap<>();
        Map<Integer, Integer> maxMap = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            if (!maxMap.containsKey(colors[i])) {
                minMap.put(colors[i], i);
            }
            maxMap.put(colors[i], i);
        }
        int output = 0;
        for (int i: maxMap.keySet()) {
            for (int j: minMap.keySet()) {
                if (i == j) {
                    continue;
                }
                int diff = Math.abs(maxMap.get(i) - minMap.get(j));
                if (diff > output) {
                    output = diff;
                }
            }
        }
        return output;
    }
}
