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

import java.util.TreeSet;

public class CountPrimesCycleCalculate implements CountPrimes {
    @Override
    public int countPrimes(int n) {
        TreeSet<Integer> primes = new TreeSet<>();
        for (int i = 2; i < n; i++) {
            boolean prime = true;
            for (Integer p: primes) {
                if (i % p == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes.add(i);
            }
        }
        return primes.size();
    }
}
