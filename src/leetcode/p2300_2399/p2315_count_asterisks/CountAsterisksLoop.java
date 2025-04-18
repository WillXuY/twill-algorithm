package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountAsterisks;

public class CountAsterisksLoop implements CountAsterisks {
    @Override
    public int countAsterisks(String s) {
        int output = 0;
        boolean include = true;
        for (char c: s.toCharArray()) {
            if ('|' == c) {
                include = !include;
                continue;
            }
            if (include && '*' == c) {
                output++;
            }
        }
        return output;
    }
}
