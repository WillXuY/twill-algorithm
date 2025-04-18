package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumEnemyFortsThatCanBeCaptured;

public class MaximumEnemyFortsThatCanBeCapturedCount
        implements MaximumEnemyFortsThatCanBeCaptured {
    @Override
    public int captureForts(int[] forts) {
        int output = 0;
        int lastFort = 0;
        int count0 = 0;
        for (int f: forts) {
            if (f == 0) {
                if (lastFort != 0) {
                    count0++;
                }
            } else if (f == 1) {
                if (lastFort == -1) {
                    if (count0 > output) {
                        output = count0;
                    }
                }
                lastFort = 1;
                count0 = 0;
            } else if (f == -1) {
                if (lastFort == 1) {
                    if (count0 > output) {
                        output = count0;
                    }
                }
                lastFort = -1;
                count0 = 0;
            }
        }
        return output;
    }
}
