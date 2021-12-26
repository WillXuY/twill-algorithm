/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.BinaryGap;

public class BinaryGapCount implements BinaryGap {
    /**
     * 1. Get the binary, bit by bit.
     * 2. Loop and compare the distance.
     *
     * @param n 1 <= n <= 10^9
     */
    @Override
    public int binaryGap(int n) {
        int max = 0;
        int count = -1;
        while (n > 0) {
            int bit = n % 2;
            if (bit == 1) {
                if (count != -1) {
                    max = Math.max(max, count);
                }
                count = 1;
            } else if (count != -1) {
                count++;
            }
            n = n / 2;
        }
        return max;
    }
}
