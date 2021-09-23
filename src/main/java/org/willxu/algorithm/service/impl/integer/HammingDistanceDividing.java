package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.HammingDistance;

public class HammingDistanceDividing implements HammingDistance {
    @Override
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor > 0) {
            if (xor % 2 == 1) {
                count++;
            }
            xor /= 2;
        }
        return count;
    }
}
