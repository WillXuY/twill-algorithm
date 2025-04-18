/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ReverseInteger;

public class ReverseIntegerModulus implements ReverseInteger {
    @Override
    public int reverseInteger(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x *= -1;
        }
        int result = x % 10;
        int quotient = x / 10;
        while (quotient != 0) {
            if (result > (Integer.MAX_VALUE - quotient % 10) / 10) {
                return 0;
            }
            result *= 10;
            result += quotient % 10;
            quotient /= 10;
        }
        if (isNegative) {
            result *= -1;
        }
        return result;
    }
}
