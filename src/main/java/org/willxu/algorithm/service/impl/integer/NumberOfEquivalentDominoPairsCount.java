package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfEquivalentDominoPairs;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEquivalentDominoPairsCount
        implements NumberOfEquivalentDominoPairs {
    /**
     * 1. Define a map save the dominoes as key, save the count as value.
     * 2. Calculate all the map's value.
     *
     * @param dominoes 1 <= dominoes.length <= 4 * 10^4
     *                 dominoes[i].length == 2
     *                 1 <= dominoes[i][j] <= 9
     * @return sum of count of pair.
     */
    @Override
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> indexCount = new HashMap<>();
        for (int[] dom : dominoes) {
            String d = dom[0] + "-" + dom[1];
            String b = dom[1] + "-" + dom[0];
            if (indexCount.containsKey(d)) {
                indexCount.put(d, indexCount.get(d) + 1);
            } else if (indexCount.containsKey(b)) {
                indexCount.put(b, indexCount.get(b) + 1);
            } else {
                indexCount.put(d, 1);
            }
        }
        int output = 0;
        for (Integer i: indexCount.values()) {
            output += (i) * (i - 1) / 2;
        }
        return output;
    }
}
