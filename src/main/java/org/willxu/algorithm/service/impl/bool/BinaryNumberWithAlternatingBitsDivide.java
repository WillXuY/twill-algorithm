/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.BinaryNumberWithAlternatingBits;

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
