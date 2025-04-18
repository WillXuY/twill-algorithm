package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.RingsAndRods;

public class RingsAndRodsCount implements RingsAndRods {
    @Override
    public int countPoints(String rings) {
        // R = 1, G = 2, B = 4
        int[] count = new int[10];
        char[] chars = rings.toCharArray();
        for (int i = 1; i < rings.length(); i += 2) {
            char c = chars[i - 1];
            int index = chars[i] - '0';
            if (c == 'R' && (count[index] & 1) != 1) {
                count[index] += 1;
            } else if (c == 'G' && (count[index] & 2) != 2) {
                count[index] += 2;
            } else if (c == 'B' && (count[index] & 4) != 4) {
                count[index] += 4;
            }
        }
        int output = 0;
        for (int c: count) {
            if (c == 7) {
                output++;
            }
        }
        return output;
    }
}
