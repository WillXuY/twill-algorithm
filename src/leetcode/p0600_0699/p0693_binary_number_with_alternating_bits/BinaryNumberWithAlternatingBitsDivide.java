/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0693_binary_number_with_alternating_bits;

public class BinaryNumberWithAlternatingBitsDivide
        implements BinaryNumberWithAlternatingBits {
    @Override
    public boolean hasAlternatingBits(int n) {
        int remainder = n % 2;
        n = n / 2;
        while (n > 0) {
            if (remainder == n % 2) {
                return false;
            }
            remainder = n % 2;
            n = n / 2;
        }
        return true;
    }
}
