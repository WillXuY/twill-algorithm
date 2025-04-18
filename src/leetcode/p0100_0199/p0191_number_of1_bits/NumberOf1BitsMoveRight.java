/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0191_number_of1_bits;

public class NumberOf1BitsMoveRight implements NumberOf1Bits {
    @Override
    public int hammingWeight(int n) {
        int hammingWeight = 0;
        while (n != 0) {
            hammingWeight += n & 1;
            n >>>= 1;
        }
        return hammingWeight;
    }
}
