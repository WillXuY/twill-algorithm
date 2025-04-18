package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MagicalString;

public class MagicalStringLoop implements MagicalString {
    @Override
    public int magicalString(int n) {
        int[] array = new int[n];
        array[0] = 1;
        int countOne = 1;
        int countIndex = 1;
        for (int i = 1; i < n; i++) {
            int thisNum = array[i - 1] ^ 3;
            array[i] = thisNum;
            int count = array[countIndex];
            countIndex++;
            if (count == 1) {
                if (thisNum == 1) {
                    countOne++;
                }
                continue;
            }
            // count is 2.
            if (thisNum == 2) {
                if (i + 1 < n) {
                    array[i + 1] = 2;
                    i++;
                }
                continue;
            }
            // thisNum is 1.
            if (i + 1 < n) {
                array[i + 1] = 1;
                i++;
                countOne += 2;
            } else {
                countOne++;
            }
        }
        return countOne;
    }
}
