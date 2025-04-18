/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0231_power_of_two;

public class PowerOfTwoBinary implements PowerOfTwo {
    @Override
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 2) {
            if ((n & 1) != 0) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }
}
