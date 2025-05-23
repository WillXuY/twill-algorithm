/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 *
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0231_power_of_two;

public class PowerOfTwoString implements PowerOfTwo {
    @Override
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        String binary = Integer.toBinaryString(n);
        return binary.replaceAll("0", "").length() == 1;
    }
}
