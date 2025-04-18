/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ClimbingStairs;

import java.math.BigInteger;

public class ClimbingStairsBruteForce implements ClimbingStairs {

    /**
     * Example n = 6, 7.
     * step1: List all the combination of steps.
     * step2: Permutation with repetition.
     * @see <a href="static\idea\ClimbingStair.md">Start at All Steps are 1</>
     *
     * @param n 1 <= n <= 45
     * @return number of distinct ways to climb to the top
     */
    @Override
    public int climbStairs(int n) {
        BigInteger result = new BigInteger("0");
        for (int n2 = 0; n2 <= n / 2; n2++) {
            int sumOne = n - n2 * 2;
            int sum = n - n2;
            /*
            Wrong answer 1: / by 0. out of int or int range
             */
            result = result.add(factorial(BigInteger.valueOf(sum))
                    .divide(factorial(BigInteger.valueOf(n2)))
                    .divide(factorial(BigInteger.valueOf(sumOne))));
        }
        return result.intValue();
    }

    private BigInteger factorial(BigInteger n) {
        if (n.compareTo(new BigInteger("0")) <= 0) {
            return new BigInteger("1");
        } else {
            return n.multiply(factorial(n.subtract(new BigInteger("1"))));
        }
    }
}
