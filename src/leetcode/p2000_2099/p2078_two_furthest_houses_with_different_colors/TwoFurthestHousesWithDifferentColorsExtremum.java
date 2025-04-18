package leetcode.p2000_2099.p2078_two_furthest_houses_with_different_colors;

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
