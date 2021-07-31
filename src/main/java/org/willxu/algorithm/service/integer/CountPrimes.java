/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface CountPrimes {
    /**
     * Count the number of prime numbers less than a non-negative
     * number n.
     *
     * @param n 0 <= n <= 5 * 10^6
     * @return count of primes
     */
    int countPrimes(int n);
}
