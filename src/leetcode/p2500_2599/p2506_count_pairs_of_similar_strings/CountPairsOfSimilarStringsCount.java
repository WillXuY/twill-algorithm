package leetcode.p2500_2599.p2506_count_pairs_of_similar_strings;

import java.util.HashMap;
import java.util.Map;

public class CountPairsOfSimilarStringsCount
        implements CountPairsOfSimilarStrings {
    @Override
    public int similarPairs(String[] words) {
        Map<Integer, Integer> bitMap = new HashMap<>();
        for (String w: words) {
            int bit = transChar(w);
            if (bitMap.containsKey(bit)) {
                bitMap.put(bit, bitMap.get(bit) + 1);
            } else {
                bitMap.put(bit, 1);
            }
        }
        int output = 0;
        for (int val : bitMap.values()) {
            if (val < 2) {
                continue;
            }
            output += val * (val - 1) / 2;
        }
        return output;
    }

    private int transChar(String word) {
        boolean[] charExist = new boolean[26];
        for (char c: word.toCharArray()) {
            charExist[c - 'a'] = true;
        }
        int output = 0;
        int bit = 1;
        for (boolean c: charExist) {
            if (c) {
                output += bit;
            }
            bit *= 2;
        }
        return output;
    }
}
