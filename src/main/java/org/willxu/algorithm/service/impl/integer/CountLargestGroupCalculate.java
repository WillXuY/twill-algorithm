package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountLargestGroup;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountLargestGroupCalculate implements CountLargestGroup {
    /**
     |   1 |   2 |   3 |   4 |   5 |   6 |   7 |   8 |   9 |     |     |     |
     |  10 |  11 |  12 |  13 |  14 |  15 |  16 |  17 |  18 |  19 |     |     |
     |     |  20 |  21 |  22 |  23 |  24 |  25 |  26 |  27 |  28 |  29 |     |
     |     |     |  30 |  31 |  32 |  33 |  34 |  35 |  36 |  37 |  38 | 39  |
     |     |     |     | ... | ... | ... | ... | ... | ... | ... | ... | ... |
     |     |     |     |     |     |     |     |  80 |  81 |  82 |  83 | ... |
     |     |     |     |     |     |     |     |     |  90 |  91 |  92 | ... |
     | 100 | 101 | 102 | 103 | 104 | 105 | 106 | 107 | 108 | 109 |     |     |
     |     | 110 | 111 | 112 | 113 | 114 | 115 | 116 | 117 | 118 | 119 |     |
     |     |     | 120 | 121 | 122 | 123 | 124 | 125 | 126 | 127 | 128 | 129 |
     |     |     |     |     |     |     |     |     |     |     |     |     |
     */
    @Override
    public int countLargestGroup(int n) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int count = countDigit(i);
            if (countMap.containsKey(count)) {
                countMap.put(count, countMap.get(count) + 1);
            } else {
                countMap.put(count, 1);
            }
        }
        return Collections.frequency(
                countMap.values(), Collections.max(countMap.values()));
    }

    public int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 10;
            n /= 10;
        }
        return count;
    }
}
