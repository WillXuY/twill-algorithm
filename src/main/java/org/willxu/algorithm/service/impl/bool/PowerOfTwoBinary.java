/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.PowerOfTwo;

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
