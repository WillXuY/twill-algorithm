/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integerarray;

import org.willxu.algorithm.service.integerarray.PlusOne;

public class PlusOneBruteForce implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        int addToNext = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] + addToNext) == 10) {
                digits[i] = 0;
            } else {
                digits[i] += addToNext;
                addToNext = 0;
            }
            if (addToNext == 0) {
                i = -1;
            }
        }
        if (addToNext == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }
}
