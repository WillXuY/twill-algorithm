package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountSquareSumTriples;

public class CountSquareSumTriplesExhaustive implements CountSquareSumTriples {
    @Override
    public int countTriples(int n) {
        int output = 0;
        for (int i = 3; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (i * i + j * j == k * k) {
                        output += 2;
                    }
                }
            }
        }
        return output;
    }
}
