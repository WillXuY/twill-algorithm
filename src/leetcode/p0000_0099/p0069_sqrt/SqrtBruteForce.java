/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0069_sqrt;

public class SqrtBruteForce implements Sqrt {

    @Override
    public int mySqrt(int x) {
        final int maxSqrtRootOfInt = 46340;
        int half = x / 2 + 1;
        int min = 0;
        int max = Math.min(half, maxSqrtRootOfInt);
        half = max / 2;
        while (max != min) {
            int test = half * half;
            if (test < x) {
                min = half;
            } else if (test > x) {
                max = half;
            } else {
                return half;
            }
            if (max - min == 1) {
                /*
                accept min as result cause wrong answer 1, 2
                (max * max == x) cause wrong answer 3.
                 */
                if (max * max <= x) {
                    return max;
                }
                return min;
            }
            half = min + (max - min) / 2;
        }
        return half;
    }
}
