package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.ThreeConsecutiveOdds;

public class ThreeConsecutiveOddsCount implements ThreeConsecutiveOdds {
    @Override
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int a: arr) {
            if ((a & 1) == 1) {
                count++;
                if (count >= 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
