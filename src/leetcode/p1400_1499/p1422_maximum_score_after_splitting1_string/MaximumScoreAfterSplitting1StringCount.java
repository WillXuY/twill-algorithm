package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumScoreAfterSplitting1String;

public class MaximumScoreAfterSplitting1StringCount
        implements MaximumScoreAfterSplitting1String {
    @Override
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int count1 = 0;
        if (chars[chars.length - 1] == '1') {
            count1 = 1;
        }
        int countDiff = 1;
        if (chars[0] == '1') {
            countDiff = 0;
        }
        int max = countDiff;
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] == '1') {
                count1++;
                countDiff--;
            } else {
                countDiff++;
                max = Math.max(max, countDiff);
            }
        }
        return count1 + max;
    }
}
