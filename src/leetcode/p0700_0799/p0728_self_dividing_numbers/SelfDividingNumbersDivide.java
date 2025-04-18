/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0728_self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbersDivide implements SelfDividingNumbers {
    @Override
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int quotient = i;
            while (quotient > 0) {
                int remainder = quotient % 10;
                if (remainder == 0) {
                    break;
                }
                if (i % remainder != 0) {
                    break;
                }
                quotient /= 10;
            }
            if (quotient == 0) {
                output.add(i);
            }
        }
        return output;
    }
}
