package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumNumberOfBallsInBox;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInBoxCount
        implements MaximumNumberOfBallsInBox {
    @Override
    public int countBalls(int lowLimit, int highLimit) {
        int output = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int key = 0;
            int loopI = i;
            while (loopI > 0) {
                key += loopI % 10;
                loopI /= 10;
            }
            if (countMap.containsKey(key)) {
                int value = countMap.get(key) + 1;
                countMap.put(key, value);
                if (value > output) {
                    output = value;
                }
            } else {
                countMap.put(key, 1);
                if (1 > output) {
                    output = 1;
                }
            }
        }
        return output;
    }
}
