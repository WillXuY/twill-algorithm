/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountPrimes;

public class CountPrimesMarkRemove implements CountPrimes {
    @Override
    public int countPrimes(int n) {
        // index means the number, boolean means is prime or not
        boolean[] composeArray = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            // if i is not a compose number
            if (!composeArray[i]) {
                // Mark and remove all the multiple numbers.
                for (int j = 2; j * i < n; j++) {
                    composeArray[j * i] = true;
                }
            }
        }
        // count the prime number
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!composeArray[i]) {
                count++;
            }
        }
        return count;
    }
}
