/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface DistributeCandies {
    /**
     * Alice has n candies, where the i^th candy is of type
     * candyType[i]. Alice noticed that she started to gain weight, so
     * she visited a doctor.
     * The doctor advised Alice to only eat n/2 of the candies she has
     * (n is always even). Alice likes her candies very mush, and she
     * wants to eat the maximum number of different types of candies
     * while still following the doctors's advice.
     * Given the integer array candyType of length n, return the maximum
     * number of different types of candies she can eat if she only eats
     * n/2 of them.
     *
     * @param candyType 2 <= candyType.length <= 10^4
     *                  candyType.length is even.
     *                  -10^5 <= candyType[i] <= 10^5
     * @return maximum number of different types of candies.
     */
    int distributeCandies(int[] candyType);
}
