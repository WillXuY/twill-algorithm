package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.LongerContiguousSegmentsOfOnesThanZeros;

public class LongerContiguousSegmentsOfOnesThanZerosCount
        implements LongerContiguousSegmentsOfOnesThanZeros {
    @Override
    public boolean checkZeroOnes(String s) {
        char[] chars = s.toCharArray();
        int maxCount1 = 0, maxCount0 = 0;
        int count1 = 0, count0 = 0;
        for (char c: chars) {
            if (c == '1') {
                if (count0 > maxCount0) {
                    maxCount0 = count0;
                }
                count0 = 0;
                count1++;
            } else {
                if (count1 > maxCount1) {
                    maxCount1 = count1;
                }
                count1 = 0;
                count0++;
            }
        }
        if (count1 > maxCount1) {
            maxCount1 = count1;
        }
        if (count0 > maxCount0) {
            maxCount0 = count0;
        }
        return maxCount1 > maxCount0;
    }
}
