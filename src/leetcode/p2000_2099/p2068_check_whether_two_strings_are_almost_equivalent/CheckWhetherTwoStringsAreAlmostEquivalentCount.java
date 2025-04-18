package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckWhetherTwoStringsAreAlmostEquivalent;

public class CheckWhetherTwoStringsAreAlmostEquivalentCount
        implements CheckWhetherTwoStringsAreAlmostEquivalent {
    @Override
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c: word1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c: word2.toCharArray()) {
            count2[c - 'a']++;
        }
        int maxDiff = 0;
        for (int i = 0; i < 26; i++) {
            int diff = Math.abs(count1[i] - count2[i]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff < 4;
    }
}
